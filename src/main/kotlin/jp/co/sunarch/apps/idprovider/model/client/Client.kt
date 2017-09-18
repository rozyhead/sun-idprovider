package jp.co.sunarch.apps.idprovider.model.client

data class Client(
    val id: ClientId,
    val name: String,
    val type: ClientType,
    val secret: ClientSecret
)