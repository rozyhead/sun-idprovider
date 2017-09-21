package jp.co.sunarch.apps.idprovider.repository.memory

import jp.co.sunarch.apps.idprovider.model.oauth2.GrantedRefreshToken
import jp.co.sunarch.apps.idprovider.model.oauth2.GrantedRefreshTokenRepository
import jp.co.sunarch.apps.idprovider.model.oauth2.RefreshToken
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class InMemoryGrantedRefreshTokenRepository : GrantedRefreshTokenRepository {

  var entities = mapOf<RefreshToken, GrantedRefreshToken>()

  override fun generateToken(): RefreshToken {
    return RefreshToken(UUID.randomUUID().toString())
  }

  override fun save(entity: GrantedRefreshToken) {
    entities += entity.token to entity
  }

}