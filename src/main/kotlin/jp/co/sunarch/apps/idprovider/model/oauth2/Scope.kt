package jp.co.sunarch.apps.idprovider.model.oauth2

/**
 * 要求する権限を表す文字列。
 */
data class Scope(val value: String)

object OpenIDConnectScopes {
  val OPENID = Scope("openid")
}