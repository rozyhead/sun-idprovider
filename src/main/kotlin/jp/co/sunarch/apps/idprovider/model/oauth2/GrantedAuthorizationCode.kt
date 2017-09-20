package jp.co.sunarch.apps.idprovider.model.oauth2

import jp.co.sunarch.apps.idprovider.model.client.ClientId
import jp.co.sunarch.apps.idprovider.model.owner.ResourceOwnerId
import java.time.LocalDateTime

/**
 * 発行済認可コード。
 */
data class GrantedAuthorizationCode(
    val code: AuthorizationCode,
    val grantedAt: LocalDateTime,
    val grantedBy: ResourceOwnerId,
    val expiresInSeconds: Int,
    val clientId: ClientId,
    val redirectUri: RedirectUri?,
    val scopes: Set<Scope>,
    val invalidated: Boolean = false
) {

  fun isValid(now: LocalDateTime): Boolean {
    if (invalidated) {
      return false
    }

    if (grantedAt.plusSeconds(expiresInSeconds.toLong()) < now) {
      return false
    }

    return true
  }
}