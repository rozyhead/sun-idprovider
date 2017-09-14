package jp.co.sunarch.apps.idprovider.model.oauth2.password;

import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory;
import jp.co.sunarch.apps.idprovider.model.oauth2.TokenEndpoint;
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse;

/**
 * @author takeshi
 */
public class ResourceOwnerPasswordCredentialsFlow implements TokenEndpoint<ResourceOwnerPasswordCredentialsAccessTokenRequest, AccessTokenResponse> {

  @Override
  public EndpointRequestFactory<ResourceOwnerPasswordCredentialsAccessTokenRequest> tokenRequestFactory() {
    // TODO
    return null;
  }

  @Override
  public AccessTokenResponse createToken(ResourceOwnerPasswordCredentialsAccessTokenRequest request) {
    // TODO
    return null;
  }

}
