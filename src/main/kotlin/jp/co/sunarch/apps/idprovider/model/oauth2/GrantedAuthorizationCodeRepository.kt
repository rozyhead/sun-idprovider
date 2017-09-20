package jp.co.sunarch.apps.idprovider.model.oauth2

interface GrantedAuthorizationCodeRepository {

  fun generateCode(): AuthorizationCode

  fun save(entity: GrantedAuthorizationCode)

  fun findByCode(code: AuthorizationCode): GrantedAuthorizationCode?

}