package jp.co.sunarch.apps.idprovider.model.oauth2.refresh

import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory
import jp.co.sunarch.apps.idprovider.model.oauth2.TokenEndpoint
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse

/**
 * @author takeshi
 */
class RefreshTokenFlow : TokenEndpoint<RefreshTokenAccessTokenRequest, AccessTokenResponse> {

  override fun tokenRequestFactory(): EndpointRequestFactory<RefreshTokenAccessTokenRequest> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun createToken(request: RefreshTokenAccessTokenRequest): AccessTokenResponse {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}
