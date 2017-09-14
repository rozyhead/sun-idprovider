package jp.co.sunarch.apps.idprovider.model.oauth2

/**
 * @author takeshi
 */
data class AccessTokenResponse(
    val accessToken: AccessToken,
    val tokenType: AccessTokenType,
    val expiresIn: Long?,
    val refreshToken: RefreshToken?,
    val scope: Set<Scope>?
)

