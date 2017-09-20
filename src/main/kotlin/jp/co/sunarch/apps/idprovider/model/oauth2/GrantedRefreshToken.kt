package jp.co.sunarch.apps.idprovider.model.oauth2

import jp.co.sunarch.apps.idprovider.model.client.ClientId
import java.time.LocalDateTime

/**
 * 発行されたリフレッシュトークン。
 */
data class GrantedRefreshToken(
    val token: RefreshToken,
    val createdAt: LocalDateTime,
    val expiresInSeconds: Int,
    val clientId: ClientId,
    val scopes: Set<Scope>,
    val accessToken: AccessToken,
    val authorizationCode: AuthorizationCode?,
    val invalidated: Boolean = false
)
