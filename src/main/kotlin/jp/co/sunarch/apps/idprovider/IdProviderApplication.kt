package jp.co.sunarch.apps.idprovider

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class IdProviderApplication {
}

fun main(args: Array<String>) {
  SpringApplication.run(IdProviderApplication::class.java, *args)
}
