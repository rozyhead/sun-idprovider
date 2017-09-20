package jp.co.sunarch.apps.idprovider.model.oauth2

interface GrantedRefreshTokenRepository {

  fun generateToken(): RefreshToken

  fun save(entity: GrantedRefreshToken)

}