package jp.co.sunarch.apps.idprovider.model.oauth2.hybrid;

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationEndpoint;
import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory;

/**
 * @author takeshi
 */
public class HybridFlow implements AuthorizationEndpoint<HybridAuthorizationRequest, HybridAuthorizationResponse> {

  @Override
  public EndpointRequestFactory<HybridAuthorizationRequest> authorizationRequestFactory() {
    // TODO
    return null;
  }

  @Override
  public HybridAuthorizationResponse authorize(HybridAuthorizationRequest request) {
    // TODO
    return null;
  }

}
