package jp.co.sunarch.apps.idprovider.model.oauth2.client;

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
public class ClientCredentialsAccessTokenRequest {

  private Set<Scope> scope;

}
