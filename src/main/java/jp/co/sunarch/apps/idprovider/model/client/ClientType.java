package jp.co.sunarch.apps.idprovider.model.client;

/**
 * クライアントタイプ
 */
public enum ClientType {

  /**
   * クレデンシャルの機密性を維持することができるクライアント、または他の手段を使用したセキュアなクライアント認証ができるクライアント
   */
  CONFIDENTIAL,

  /**
   * クライアントクレデンシャルの機密性を維持することができず, かつ他の手段を使用したセキュアなクライアント認証もできないクライアント
   */
  PUBLIC
}
