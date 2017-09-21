package jp.co.sunarch.apps.idprovider.repository.memory

import jp.co.sunarch.apps.idprovider.model.oauth2.AccessToken
import jp.co.sunarch.apps.idprovider.model.oauth2.GrantedAccessToken
import jp.co.sunarch.apps.idprovider.model.oauth2.GrantedAccessTokenRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class InMemoryGrantedAccessTokenRepository : GrantedAccessTokenRepository {

  var entities = mapOf<AccessToken, GrantedAccessToken>()

  override fun generateToken(): AccessToken {
    return AccessToken(UUID.randomUUID().toString())
  }

  override fun save(entity: GrantedAccessToken) {
    entities += entity.token to entity
  }

}