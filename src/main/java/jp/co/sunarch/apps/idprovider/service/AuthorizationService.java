package jp.co.sunarch.apps.idprovider.service;

import jp.co.sunarch.apps.idprovider.model.oauth2.code.AuthorizationCodeAuthorizationRequest;
import jp.co.sunarch.apps.idprovider.model.oauth2.code.AuthorizationCodeAuthorizationResponse;

/**
 * @author takeshi
 */
public interface AuthorizationService {

  AuthorizationCodeAuthorizationResponse authorize(AuthorizationCodeAuthorizationRequest request);

}
