package jp.co.sunarch.apps.idprovider.model.oauth2.refresh;

import jp.co.sunarch.apps.idprovider.model.oauth2.EndpointRequestFactory;
import jp.co.sunarch.apps.idprovider.model.oauth2.TokenEndpoint;
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenResponse;

/**
 * @author takeshi
 */
public class RefreshTokenFlow implements TokenEndpoint<RefreshTokenAccessTokenRequest, AccessTokenResponse> {

  @Override
  public EndpointRequestFactory<RefreshTokenAccessTokenRequest> tokenRequestFactory() {
    return null;
  }

  @Override
  public AccessTokenResponse createToken(RefreshTokenAccessTokenRequest request) {
    return null;
  }

}
