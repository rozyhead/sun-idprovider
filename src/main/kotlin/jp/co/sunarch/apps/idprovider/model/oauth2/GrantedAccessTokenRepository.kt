package jp.co.sunarch.apps.idprovider.model.oauth2

interface GrantedAccessTokenRepository {

  fun generateToken(): AccessToken

  fun save(entity: GrantedAccessToken)

}

