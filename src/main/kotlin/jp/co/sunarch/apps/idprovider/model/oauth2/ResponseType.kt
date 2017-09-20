package jp.co.sunarch.apps.idprovider.model.oauth2

/**
 * 認可リクエストに対して、変換すべきコード・トークンを識別するための値。
 *
 * code, tokenなどがある。
 */
enum class ResponseType {

  CODE,

  TOKEN,

  ID_TOKEN;

  companion object {
    fun of(name: String): ResponseType? = when (name) {
      "code" -> CODE
      "token" -> TOKEN
      "id_token" -> ID_TOKEN
      else -> null
    }
  }

}
