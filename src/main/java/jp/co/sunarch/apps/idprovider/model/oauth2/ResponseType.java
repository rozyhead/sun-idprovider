package jp.co.sunarch.apps.idprovider.model.oauth2;

/**
 * 認可リクエストに対して、変換すべきコード・トークンを識別するための値。
 *
 * code, tokenなどがある。
 */
public enum ResponseType {

  CODE,

  TOKEN,

  ID_TOKEN

}
