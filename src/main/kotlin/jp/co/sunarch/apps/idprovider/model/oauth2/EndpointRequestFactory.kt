package jp.co.sunarch.apps.idprovider.model.oauth2

/**
 * 各エンドポイント用にリクエストオブジェクトを作成する
 */
interface EndpointRequestFactory<out R> {

  fun createRequest(parameters: Map<String, String>): R

}
