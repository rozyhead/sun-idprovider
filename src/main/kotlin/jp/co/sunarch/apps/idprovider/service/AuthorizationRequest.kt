package jp.co.sunarch.apps.idprovider.service

import jp.co.sunarch.apps.idprovider.model.client.ClientId
import jp.co.sunarch.apps.idprovider.model.oauth2.*

/**
 * 認可リクエスト
 */
class AuthorizationRequest(
    val responseType: Set<ResponseType>,
    val clientId: ClientId,
    val redirectUri: RedirectUri? = null,
    val scope: Set<Scope> = emptySet(),
    val state: String? = null
) {

  fun isAuthorizationCodeFlow(): Boolean {
    return responseType.contains(ResponseType.CODE) && responseType.size == 1
  }

  fun isImplicitFlow(): Boolean {
    return !responseType.contains(ResponseType.CODE)
  }

  fun isHybridFlow(): Boolean {
    return responseType.contains(ResponseType.CODE) && responseType.size > 1
  }

  fun isOpenIDConnect(): Boolean {
    return responseType.contains(ResponseType.ID_TOKEN) || scope.contains(OpenIDConnectScopes.OPENID)
  }

  companion object {

    fun from(params: Map<String, String>): AuthorizationRequest {
      return AuthorizationRequest(
          responseType = responseType(params),
          clientId = clientId(params),
          redirectUri = redirectUri(params),
          scope = scope(params),
          state = state(params)
      )
    }

    private fun responseType(params: Map<String, String>): Set<ResponseType> {
      val responseType = params["response_type"]?.let {
        it.split(' ')
            .filter { it.isNotEmpty() }
            .map { ResponseType.of(it) ?: throw InvalidRequestException("invalid response_type $it") }
            .toSet()
      }

      if (responseType == null || responseType.isEmpty()) {
        throw InvalidRequestException("response_type is required")
      }

      return responseType
    }

    private fun clientId(params: Map<String, String>): ClientId {
      return params["client_id"]?.let { ClientId(it) }
          ?: throw InvalidRequestException("client_id is required")
    }

    private fun redirectUri(params: Map<String, String>): RedirectUri? {
      return params["redirect_uri"]?.let { RedirectUri(it) }
    }

    private fun scope(params: Map<String, String>): Set<Scope> {
      return params["scope"]?.let {
        it.split(' ')
            .filter { it.isNotEmpty() }
            .map { Scope(it) }
            .toSet()
      } ?: emptySet()
    }

    private fun state(params: Map<String, String>) = params["state"]

  }

}
