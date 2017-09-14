package jp.co.sunarch.apps.idprovider.model.oauth2.code;

import jp.co.sunarch.apps.idprovider.model.client.ClientId;
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri;
import jp.co.sunarch.apps.idprovider.model.oauth2.Scope;

import java.util.Map;
import java.util.Set;

/**
 * 認可コードフロー時の認可リクエスト
 */
public class AuthorizationCodeAuthorizationRequest {

  private ClientId clientId;
  private RedirectUri redirectUri;
  private Set<Scope> scope;
  private String state;

  public static AuthorizationCodeAuthorizationRequest from(Map<String, String> params) {
    // TODO
    return new AuthorizationCodeAuthorizationRequest();
  }

}
