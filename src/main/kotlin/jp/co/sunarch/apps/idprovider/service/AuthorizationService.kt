package jp.co.sunarch.apps.idprovider.service

import jp.co.sunarch.apps.idprovider.model.oauth2.*
import jp.co.sunarch.apps.idprovider.model.owner.ResourceOwnerId
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.Clock
import java.time.LocalDateTime

/**
 * 認可サービス
 */
interface AuthorizationService {

  fun authorizeAuthorizationCodeFlow(resourceOwnerId: ResourceOwnerId, request: AuthorizationRequest): AuthorizationResponse
  fun authorizeImplicitFlow(resourceOwnerId: ResourceOwnerId, request: AuthorizationRequest): AccessTokenResponse
  fun authorizeHybridFlow(resourceOwnerId: ResourceOwnerId, request: AuthorizationRequest): AuthorizationResponse

}

@Service
class AuthorizationServiceImpl(
    val authorizationProperties: AuthorizationProperties,
    val grantedAuthorizationCodeRepository: GrantedAuthorizationCodeRepository,
    val grantedAccessTokenRepository: GrantedAccessTokenRepository,
    val clock: Clock
) : AuthorizationService {

  @Transactional
  override fun authorizeAuthorizationCodeFlow(resourceOwnerId: ResourceOwnerId, request: AuthorizationRequest): AuthorizationResponse {
    if (request.isOpenIDConnect()) {
      // OpenID ConnectのAuthorization code flow
      TODO("not implemented")
    } else {
      // 通常のOAuth2のAuthorization code flow

      // TODO パラメータのチェック

      // AuthorizationCode発行
      val code = GrantedAuthorizationCode(
          code = grantedAuthorizationCodeRepository.generateCode(),
          grantedAt = LocalDateTime.now(clock),
          grantedBy = resourceOwnerId,
          expiresInSeconds = authorizationProperties.authorizationCode.expiresInSeconds,
          clientId = request.clientId,
          redirectUri = request.redirectUri,
          scopes = request.scope
      )

      grantedAuthorizationCodeRepository.save(code)

      return AuthorizationResponse(
          code = code.code,
          state = request.state
      )
    }
  }

  override fun authorizeImplicitFlow(resourceOwnerId: ResourceOwnerId, request: AuthorizationRequest): AccessTokenResponse {
    if (request.isOpenIDConnect()) {
      // OpenID ConnectのImplicit flow
      TODO("not implemented")
    } else {
      // 通常のOAuth2のImplicit flow

      // TODO パラメータのチェック

      // AccessToken発行
      val token = GrantedAccessToken(
          token = grantedAccessTokenRepository.generateToken(),
          type = AccessTokenType.BEARER,
          grantedAt = LocalDateTime.now(clock),
          grantedBy = resourceOwnerId,
          expiresInSeconds = authorizationProperties.accessToken.expiresInSeconds,
          clientId = request.clientId,
          scopes = request.scope
      )

      grantedAccessTokenRepository.save(token)

      return AccessTokenResponse(
          accessToken = token.token,
          tokenType = token.type,
          expiresIn = token.expiresInSeconds,
          scope = token.scopes,
          state = request.state
      )
    }
  }

  override fun authorizeHybridFlow(resourceOwnerId: ResourceOwnerId, request: AuthorizationRequest): AuthorizationResponse {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}
