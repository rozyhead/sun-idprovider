package jp.co.sunarch.apps.idprovider.repository.memory

import jp.co.sunarch.apps.idprovider.model.client.Client
import jp.co.sunarch.apps.idprovider.model.client.ClientId
import jp.co.sunarch.apps.idprovider.model.client.ClientRepository
import org.springframework.stereotype.Repository

@Repository
class InMemoryClientRepository : ClientRepository {

  var entities = mapOf<ClientId, Client>()

  override fun findById(id: ClientId): Client? {
    return entities[id]
  }

}