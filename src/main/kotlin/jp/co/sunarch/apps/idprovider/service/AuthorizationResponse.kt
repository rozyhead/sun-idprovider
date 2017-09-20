package jp.co.sunarch.apps.idprovider.service

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationCode
import jp.co.sunarch.apps.idprovider.model.oauth2.RedirectUri

/**
 * 認可レスポンス
 */
data class AuthorizationResponse(
    val code: AuthorizationCode,
    val state: String? = null
)

