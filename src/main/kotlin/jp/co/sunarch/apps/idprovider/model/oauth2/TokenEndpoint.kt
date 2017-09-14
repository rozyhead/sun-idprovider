package jp.co.sunarch.apps.idprovider.model.oauth2

/**
 * @author takeshi
 */
interface TokenEndpoint<REQ, out RESP> {

  fun tokenRequestFactory(): EndpointRequestFactory<REQ>

  fun createToken(request: REQ): RESP

}
