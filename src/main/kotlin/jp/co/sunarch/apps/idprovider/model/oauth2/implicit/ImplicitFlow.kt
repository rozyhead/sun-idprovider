package jp.co.sunarch.apps.idprovider.model.oauth2.implicit

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationEndpoint
import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse

/**
 * @author takeshi
 */
class ImplicitFlow : AuthorizationEndpoint<ImplicitAuthorizationRequest, AccessTokenResponse> {

  override fun authorizationRequestFactory(): EndpointRequestFactory<ImplicitAuthorizationRequest> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun authorize(request: ImplicitAuthorizationRequest): AccessTokenResponse {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}
