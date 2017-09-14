package jp.co.sunarch.apps.idprovider.model.oauth2.code;

import jp.co.sunarch.apps.idprovider.model.client.ClientId;
import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationCode;
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * アクセストークンリクエスト
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorizationCodeAccessTokenRequest {

  private AuthorizationCode code;
  private RedirectUri redirectUrl;
  private ClientId clientId;

}
