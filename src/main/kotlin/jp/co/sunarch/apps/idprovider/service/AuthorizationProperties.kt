package jp.co.sunarch.apps.idprovider.service

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("sun.idprovider.authorization")
class AuthorizationProperties {

  var authorizationCode = AuthorizationCodeProperties()

  var accessToken = AccessTokenProperties()

  var refreshToken = RefreshTokenProperties()

  class AuthorizationCodeProperties {
    var expiresInSeconds = 300
  }

  class AccessTokenProperties {
    var expiresInSeconds = 600
  }

  class RefreshTokenProperties {
    var expiresInSeconds = 3600
  }
}

