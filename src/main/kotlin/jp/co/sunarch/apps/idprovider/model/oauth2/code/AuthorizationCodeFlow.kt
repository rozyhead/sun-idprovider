package jp.co.sunarch.apps.idprovider.model.oauth2.code

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationEndpoint
import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory
import jp.co.sunarch.apps.idprovider.model.oauth2.TokenEndpoint
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse

/**
 * @author takeshi
 */
class AuthorizationCodeFlow : AuthorizationEndpoint<AuthorizationCodeAuthorizationRequest, AuthorizationCodeAuthorizationResponse>, TokenEndpoint<AuthorizationCodeAccessTokenRequest, AccessTokenResponse> {

  override fun authorizationRequestFactory(): EndpointRequestFactory<AuthorizationCodeAuthorizationRequest>? {
    // TODO
    return null
  }

  override fun tokenRequestFactory(): EndpointRequestFactory<AuthorizationCodeAccessTokenRequest>? {
    // TODO
    return null
  }

  override fun authorize(request: AuthorizationCodeAuthorizationRequest): AuthorizationCodeAuthorizationResponse? {
    // TODO
    return null
  }

  override fun createToken(request: AuthorizationCodeAccessTokenRequest): AccessTokenResponse? {
    // TODO
    return null
  }

}
