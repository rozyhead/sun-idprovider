package jp.co.sunarch.apps.idprovider.model.oauth2.client

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
class ClientCredentialsAccessTokenRequest {

  private val scope: Set<Scope>? = null

}
