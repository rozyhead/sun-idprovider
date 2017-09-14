package jp.co.sunarch.apps.idprovider.model.oauth2

/**
 * @author takeshi
 */
interface AuthorizationEndpoint<REQ, RESP> {

  fun authorizationRequestFactory(): EndpointRequestFactory<REQ>

  fun authorize(request: REQ): RESP

}
