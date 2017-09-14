package jp.co.sunarch.apps.idprovider.model.oauth2.refresh;

import jp.co.sunarch.apps.idprovider.model.oauth2.RefreshToken;
import jp.co.sunarch.apps.idprovider.model.oauth2.Scope;

import java.util.Set;

/**
 * @author takeshi
 */
public class RefreshTokenAccessTokenRequest {

  private RefreshToken refreshToken;
  private Set<Scope> scope;

}
