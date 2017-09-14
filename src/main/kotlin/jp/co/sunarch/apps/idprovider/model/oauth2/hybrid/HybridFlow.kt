package jp.co.sunarch.apps.idprovider.model.oauth2.hybrid

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationEndpoint
import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory

/**
 * @author takeshi
 */
class HybridFlow : AuthorizationEndpoint<HybridAuthorizationRequest, HybridAuthorizationResponse> {

  override fun authorizationRequestFactory(): EndpointRequestFactory<HybridAuthorizationRequest> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun authorize(request: HybridAuthorizationRequest): HybridAuthorizationResponse {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}
