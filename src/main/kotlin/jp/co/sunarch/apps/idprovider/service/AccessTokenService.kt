package jp.co.sunarch.apps.idprovider.service

import jp.co.sunarch.apps.idprovider.model.oauth2.*
import org.springframework.stereotype.Service
import java.time.Clock
import java.time.LocalDateTime

/**
 * アクセストークンサービス
 */
interface AccessTokenService {

  fun accessToken(request: AccessTokenRequest): AccessTokenResponse

}

@Service
class AccessTokenServiceImpl(
    val authorizationProperties: AuthorizationProperties,
    val grantedAuthorizationCodeRepository: GrantedAuthorizationCodeRepository,
    val grantedAccessTokenRepository: GrantedAccessTokenRepository,
    val grantedRefreshTokenRepository: GrantedRefreshTokenRepository,
    val clock: Clock
) : AccessTokenService {

  override fun accessToken(request: AccessTokenRequest): AccessTokenResponse {
    val code = grantedAuthorizationCodeRepository.findByCode(request.code) ?: throw InvalidRequestException()

    if (code.clientId != request.clientId) {
      throw AccessDeniedException()
    }

    if (!code.isValid(LocalDateTime.now(clock))) {
      throw AccessDeniedException()
    }

    if (code.redirectUri != null && code.redirectUri == request.redirectUri) {
      throw InvalidRequestException()
    }

    // アクセストークン発行
    val accessToken = GrantedAccessToken(
        token = grantedAccessTokenRepository.generateToken(),
        type = AccessTokenType.BEARER,
        grantedAt = LocalDateTime.now(clock),
        grantedBy = code.grantedBy,
        expiresInSeconds = authorizationProperties.accessToken.expiresInSeconds,
        clientId = code.clientId,
        scopes = code.scopes,
        authorizationCode = code.code
    )

    grantedAccessTokenRepository.save(accessToken)

    // リフレッシュトークン発行
    val refreshToken = GrantedRefreshToken(
        token = grantedRefreshTokenRepository.generateToken(),
        createdAt = LocalDateTime.now(clock),
        expiresInSeconds = authorizationProperties.refreshToken.expiresInSeconds,
        clientId = accessToken.clientId,
        scopes = accessToken.scopes,
        accessToken = accessToken.token,
        authorizationCode = accessToken.authorizationCode
    )

    grantedRefreshTokenRepository.save(refreshToken)

    return AccessTokenResponse(
        accessToken = accessToken.token,
        tokenType = accessToken.type,
        expiresIn = accessToken.expiresInSeconds,
        scope = accessToken.scopes,
        refreshToken = refreshToken.token
    )
  }

}
