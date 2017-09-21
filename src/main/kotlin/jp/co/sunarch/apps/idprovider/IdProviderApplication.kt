package jp.co.sunarch.apps.idprovider

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.time.Clock

@SpringBootApplication
class IdProviderApplication {

  @Bean
  fun defaultClock() = Clock.systemDefaultZone()

}

fun main(args: Array<String>) {
  SpringApplication.run(IdProviderApplication::class.java, *args)
}
