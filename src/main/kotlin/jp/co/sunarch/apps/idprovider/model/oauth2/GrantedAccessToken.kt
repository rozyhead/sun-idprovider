package jp.co.sunarch.apps.idprovider.model.oauth2

import jp.co.sunarch.apps.idprovider.model.client.ClientId
import jp.co.sunarch.apps.idprovider.model.owner.ResourceOwnerId
import java.time.LocalDateTime

/**
 * 発行済アクセストークン
 */
data class GrantedAccessToken(
    val token: AccessToken,
    val type: AccessTokenType,
    val grantedAt: LocalDateTime,
    val grantedBy: ResourceOwnerId,
    val expiresInSeconds: Int,
    val clientId: ClientId,
    val scopes: Set<Scope>,
    val authorizationCode: AuthorizationCode?,
    val invalidated: Boolean
)
