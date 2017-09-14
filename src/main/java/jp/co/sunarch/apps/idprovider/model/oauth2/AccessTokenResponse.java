package jp.co.sunarch.apps.idprovider.model.oauth2;

import java.util.Set;

/**
 * @author takeshi
 */
public class AccessTokenResponse {

  private AccessToken accessToken;
  private AccessTokenType tokenType;
  private long expiresIn;
  private RefreshToken refreshToken;
  private Set<Scope> scope;

}

