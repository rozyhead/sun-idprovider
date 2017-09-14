package jp.co.sunarch.apps.idprovider.model.oauth2.implicit

import jp.co.sunarch.apps.idprovider.model.client.ClientId
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri
import jp.co.sunarch.apps.idprovider.model.oauth2.ResponseType
import jp.co.sunarch.apps.idprovider.model.oauth2.Scope

import java.util.EnumSet

/**
 * @author takeshi
 */
class ImplicitAuthorizationRequest {

  private val clientId: ClientId? = null
  private val redirectUri: RedirectUri? = null
  private val scope: Set<Scope>? = null
  private val state: String? = null

}
