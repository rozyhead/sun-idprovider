package jp.co.sunarch.apps.idprovider.service

import jp.co.sunarch.apps.idprovider.model.client.ClientId
import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationCode
import jp.co.sunarch.apps.idprovider.model.oauth2.GrantType
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri

/**
 * アクセストークンリクエスト
 */
data class AccessTokenRequest(
    val grantType: GrantType,
    val code: AuthorizationCode,
    val redirectUri: RedirectUri?,
    val clientId: ClientId
)
