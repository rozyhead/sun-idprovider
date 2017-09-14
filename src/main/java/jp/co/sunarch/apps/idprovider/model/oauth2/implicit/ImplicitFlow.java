package jp.co.sunarch.apps.idprovider.model.oauth2.implicit;

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationEndpoint;
import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory;
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse;

/**
 * @author takeshi
 */
public class ImplicitFlow implements AuthorizationEndpoint<ImplicitAuthorizationRequest, AccessTokenResponse> {

  @Override
  public EndpointRequestFactory<ImplicitAuthorizationRequest> authorizationRequestFactory() {
    // TODO
    return null;
  }

  @Override
  public AccessTokenResponse authorize(ImplicitAuthorizationRequest request) {
    // TODO
    return null;
  }

}
