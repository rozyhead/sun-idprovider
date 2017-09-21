package jp.co.sunarch.apps.idprovider.repository.memory

import jp.co.sunarch.apps.idprovider.model.oauth2.AuthorizationCode
import jp.co.sunarch.apps.idprovider.model.oauth2.GrantedAuthorizationCode
import jp.co.sunarch.apps.idprovider.model.oauth2.GrantedAuthorizationCodeRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class InMemoryGrantedAuthorizationCodeRepository : GrantedAuthorizationCodeRepository {

  var entities = mapOf<AuthorizationCode, GrantedAuthorizationCode>()

  override fun generateCode(): AuthorizationCode {
    return AuthorizationCode(UUID.randomUUID().toString())
  }

  override fun save(entity: GrantedAuthorizationCode) {
    entities += entity.code to entity
  }

  override fun findByCode(code: AuthorizationCode): GrantedAuthorizationCode? {
    return entities[code]
  }

}