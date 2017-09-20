package jp.co.sunarch.apps.idprovider.model.client

interface ClientRepository {

  fun findById(id: ClientId): Client?

}