package jp.co.sunarch.apps.idprovider.model.oauth2.client;

import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory;
import jp.co.sunarch.apps.idprovider.model.oauth2.TokenEndpoint;
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse;

/**
 * @author takeshi
 */
public class ClientCredentialsFlow implements TokenEndpoint<ClientCredentialsAccessTokenRequest, AccessTokenResponse> {

  @Override
  public EndpointRequestFactory<ClientCredentialsAccessTokenRequest> tokenRequestFactory() {
    // TODO
    return null;
  }

  @Override
  public AccessTokenResponse createToken(ClientCredentialsAccessTokenRequest request) {
    // TODO
    return null;
  }

}
