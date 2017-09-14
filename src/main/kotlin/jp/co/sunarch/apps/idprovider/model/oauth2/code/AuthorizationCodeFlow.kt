package jp.co.sunarch.apps.idprovider.model.oauth2.code

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationEndpoint
import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory
import jp.co.sunarch.apps.idprovider.model.oauth2.TokenEndpoint
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse

/**
 * @author takeshi
 */
class AuthorizationCodeFlow : AuthorizationEndpoint<AuthorizationCodeAuthorizationRequest, AuthorizationCodeAuthorizationResponse>, TokenEndpoint<AuthorizationCodeAccessTokenRequest, AccessTokenResponse> {

  override fun authorizationRequestFactory(): EndpointRequestFactory<AuthorizationCodeAuthorizationRequest> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun authorize(request: AuthorizationCodeAuthorizationRequest): AuthorizationCodeAuthorizationResponse {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun tokenRequestFactory(): EndpointRequestFactory<AuthorizationCodeAccessTokenRequest> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun createToken(request: AuthorizationCodeAccessTokenRequest): AccessTokenResponse {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}
