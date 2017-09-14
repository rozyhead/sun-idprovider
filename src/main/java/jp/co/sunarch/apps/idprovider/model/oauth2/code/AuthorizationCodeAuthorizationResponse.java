package jp.co.sunarch.apps.idprovider.model.oauth2.code;

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationCode;
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri;

/**
 * @author takeshi
 */
public class AuthorizationCodeAuthorizationResponse {

  private RedirectUri redirectUri;
  private AuthorizationCode code;
  private String state;

}

