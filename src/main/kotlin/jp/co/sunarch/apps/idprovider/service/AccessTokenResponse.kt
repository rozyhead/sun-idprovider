package jp.co.sunarch.apps.idprovider.service

import jp.co.sunarch.apps.idprovider.model.oauth2.AccessToken
import jp.co.sunarch.apps.idprovider.model.oauth2.AccessTokenType
import jp.co.sunarch.apps.idprovider.model.oauth2.RefreshToken
import jp.co.sunarch.apps.idprovider.model.oauth2.Scope

data class AccessTokenResponse(
    val accessToken: AccessToken,
    val tokenType: AccessTokenType,
    val expiresIn: Int,
    val scope: Set<Scope>,
    val state: String? = null,
    val refreshToken: RefreshToken? = null
)
