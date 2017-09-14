package jp.co.sunarch.apps.idprovider.model.oauth2;

/**
 * @author takeshi
 */
public interface AuthorizationEndpoint<REQ, RESP> {

  EndpointRequestFactory<REQ> authorizationRequestFactory();

  RESP authorize(REQ request);

}
