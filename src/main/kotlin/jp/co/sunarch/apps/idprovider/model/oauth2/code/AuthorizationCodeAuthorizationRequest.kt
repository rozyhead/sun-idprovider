package jp.co.sunarch.apps.idprovider.model.oauth2.code

import jp.co.sunarch.apps.idprovider.model.client.ClientId
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri
import jp.co.sunarch.apps.idprovider.model.oauth2.Scope

/**
 * 認可コードフロー時の認可リクエスト
 */
class AuthorizationCodeAuthorizationRequest {

  private val clientId: ClientId? = null
  private val redirectUri: RedirectUri? = null
  private val scope: Set<Scope>? = null
  private val state: String? = null

  companion object {

    fun from(params: Map<String, String>): AuthorizationCodeAuthorizationRequest {
      // TODO
      return AuthorizationCodeAuthorizationRequest()
    }
  }

}
