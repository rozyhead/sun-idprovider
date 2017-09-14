package jp.co.sunarch.apps.idprovider.model.oauth2.password

import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory
import jp.co.sunarch.apps.idprovider.model.oauth2.TokenEndpoint
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse

/**
 * @author takeshi
 */
class ResourceOwnerPasswordCredentialsFlow : TokenEndpoint<ResourceOwnerPasswordCredentialsAccessTokenRequest, AccessTokenResponse> {

  override fun tokenRequestFactory(): EndpointRequestFactory<ResourceOwnerPasswordCredentialsAccessTokenRequest> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun createToken(request: ResourceOwnerPasswordCredentialsAccessTokenRequest): AccessTokenResponse {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}
