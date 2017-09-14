package jp.co.sunarch.apps.idprovider.model.oauth2.hybrid;

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationCode;
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri;

/**
 * @author takeshi
 */
public class HybridAuthorizationResponse {

  private RedirectUri redirectUri;
  private AuthorizationCode code;
  private String state;

}

