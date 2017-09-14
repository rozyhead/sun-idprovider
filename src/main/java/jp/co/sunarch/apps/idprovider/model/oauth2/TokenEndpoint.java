package jp.co.sunarch.apps.idprovider.model.oauth2;

/**
 * @author takeshi
 */
public interface TokenEndpoint<REQ, RESP> {

  EndpointRequestFactory<REQ> tokenRequestFactory();

  RESP createToken(REQ request);

}
