package jp.co.sunarch.apps.idprovider.model.oauth2.code;

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationEndpoint;
import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory;
import jp.co.sunarch.apps.idprovider.model.oauth2.TokenEndpoint;
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse;

/**
 * @author takeshi
 */
public class AuthorizationCodeFlow implements
    AuthorizationEndpoint<AuthorizationCodeAuthorizationRequest, AuthorizationCodeAuthorizationResponse>,
    TokenEndpoint<AuthorizationCodeAccessTokenRequest, AccessTokenResponse> {

  @Override
  public EndpointRequestFactory<AuthorizationCodeAuthorizationRequest> authorizationRequestFactory() {
    // TODO
    return null;
  }

  @Override
  public EndpointRequestFactory<AuthorizationCodeAccessTokenRequest> tokenRequestFactory() {
    // TODO
    return null;
  }

  @Override
  public AuthorizationCodeAuthorizationResponse authorize(AuthorizationCodeAuthorizationRequest request) {
    // TODO
    return null;
  }

  @Override
  public AccessTokenResponse createToken(AuthorizationCodeAccessTokenRequest request) {
    // TODO
    return null;
  }

}
