package jp.co.sunarch.apps.idprovider.model.oauth2;

/**
 * アクセストークンリクエスト時に検証に使う値を指定する。
 *
 * 認可コードグラントの場合はauthorization_code、
 * リソースオーナーパスワードクレデンシャルグラントの場合はpassword、
 * クライアントクレデンシャルグラントの場合はclient_credentials、
 * リフレッシュトークンによるアクセストークン更新時はrefresh_tokenとなる。
 */
public enum  GrantType {

  AUTHORIZATION_CODE,

  PASSWORD,

  CLIENT_CREDENTIALS,

  REFRESH_TOKEN

}
