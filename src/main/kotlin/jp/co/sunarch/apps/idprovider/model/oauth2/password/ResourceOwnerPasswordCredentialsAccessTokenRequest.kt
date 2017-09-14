package jp.co.sunarch.apps.idprovider.model.oauth2.password

import jp.co.sunarch.apps.idprovider.model.oauth2.Scope
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

/**
 * アクセストークンリクエスト
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class ResourceOwnerPasswordCredentialsAccessTokenRequest {

  private val username: String? = null
  private val password: String? = null
  private val scope: Set<Scope>? = null

}
