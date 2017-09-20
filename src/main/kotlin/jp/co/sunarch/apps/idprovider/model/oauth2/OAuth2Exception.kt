package jp.co.sunarch.apps.idprovider.model.oauth2

import java.net.URI

sealed abstract class OAuth2Exception(
    val error: String,
    message: String? = null,
    cause: Throwable? = null
) : Exception(message, cause) {
  val description: String? = message
  abstract val uri: URI?
  abstract val state: String?
}

class InvalidRequestException(
    message: String? = null,
    cause: Throwable? = null,
    override val uri: URI? = null,
    override val state: String? = null
) : OAuth2Exception("invalid_request", message, cause)

class UnauthorizedClientException(
    message: String? = null,
    cause: Throwable? = null,
    override val uri: URI? = null,
    override val state: String? = null
) : OAuth2Exception("unauthorized_client", message, cause)

class AccessDeniedException(
    message: String? = null,
    cause: Throwable? = null,
    override val uri: URI? = null,
    override val state: String? = null
) : OAuth2Exception("unsupported_response_type", message, cause)

class UnsupportedResponseTypeException(
    message: String? = null,
    cause: Throwable? = null,
    override val uri: URI? = null,
    override val state: String? = null
) : OAuth2Exception("unsupported_response_type", message, cause)

class InvalidScopeException(
    message: String? = null,
    cause: Throwable? = null,
    override val uri: URI? = null,
    override val state: String? = null
) : OAuth2Exception("invalid_scope", message, cause)

class ServerErrorException(
    message: String? = null,
    cause: Throwable? = null,
    override val uri: URI? = null,
    override val state: String? = null
) : OAuth2Exception("server_error", message, cause)

class TemporarilyUnavailableException(
    message: String? = null,
    cause: Throwable? = null,
    override val uri: URI? = null,
    override val state: String? = null
) : OAuth2Exception("server_error", message, cause)
