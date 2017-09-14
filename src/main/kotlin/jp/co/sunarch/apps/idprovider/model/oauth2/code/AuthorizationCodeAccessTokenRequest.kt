package jp.co.sunarch.apps.idprovider.model.oauth2.code

import jp.co.sunarch.apps.idprovider.model.client.ClientId
import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationCode
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri

/**
 * アクセストークンリクエスト
 */
class AuthorizationCodeAccessTokenRequest {

  private val code: AuthorizationCode? = null
  private val redirectUrl: RedirectUri? = null
  private val clientId: ClientId? = null

}
