package jp.co.sunarch.apps.idprovider.model.oauth2.password;

import jp.co.sunarch.apps.idprovider.model.oauth2.Scope;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * アクセストークンリクエスト
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResourceOwnerPasswordCredentialsAccessTokenRequest {

  private String username;
  private String password;
  private Set<Scope> scope;

}
