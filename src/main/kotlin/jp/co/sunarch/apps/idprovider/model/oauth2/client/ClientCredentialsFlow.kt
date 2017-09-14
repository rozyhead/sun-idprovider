package jp.co.sunarch.apps.idprovider.model.oauth2.client

import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory
import jp.co.sunarch.apps.idprovider.model.oauth2.TokenEndpoint
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse

/**
 * @author takeshi
 */
class ClientCredentialsFlow : TokenEndpoint<ClientCredentialsAccessTokenRequest, AccessTokenResponse> {

  override fun tokenRequestFactory(): EndpointRequestFactory<ClientCredentialsAccessTokenRequest>? {
    // TODO
    return null
  }

  override fun createToken(request: ClientCredentialsAccessTokenRequest): AccessTokenResponse? {
    // TODO
    return null
  }

}
