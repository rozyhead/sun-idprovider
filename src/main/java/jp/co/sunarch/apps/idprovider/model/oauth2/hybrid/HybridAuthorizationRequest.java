package jp.co.sunarch.apps.idprovider.model.oauth2.hybrid;

import jp.co.sunarch.apps.idprovider.model.client.ClientId;
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri;
import jp.co.sunarch.apps.idprovider.model.oauth2.ResponseType;
import jp.co.sunarch.apps.idprovider.model.oauth2.Scope;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author takeshi
 */
public class HybridAuthorizationRequest {

  private EnumSet<ResponseType> responseType;
  private ClientId clientId;
  private RedirectUri redirectUri;
  private Set<Scope> scope;
  private String state;

  // TODO
}
