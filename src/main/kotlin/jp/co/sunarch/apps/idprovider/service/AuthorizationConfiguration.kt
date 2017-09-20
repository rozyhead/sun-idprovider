package jp.co.sunarch.apps.idprovider.service

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(AuthorizationProperties::class)
class AuthorizationConfiguration {
}