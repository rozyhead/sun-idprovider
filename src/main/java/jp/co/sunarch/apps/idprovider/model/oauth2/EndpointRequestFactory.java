package jp.co.sunarch.apps.idprovider.model.oauth2;

import java.util.Map;

/**
 * 各エンドポイント用にリクエストオブジェクトを作成する
 */
public interface EndpointRequestFactory<R> {

  R createRequest(Map<String, String> parameters);

}
