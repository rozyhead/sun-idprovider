package jp.co.sunarch.apps.idprovider.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.util.UriComponentsBuilder

/**
 * OAuth2.0の認可エンドポイント
 */
@Controller
class OAuth2Controller {

  /**
   * OAuth2.0の認可エンドポイント。
   *
   * @param params
   */
  @GetMapping("/oauth2/authorize")
  fun authorize(@RequestParam params: Map<String, String>,
                uriComponentsBuilder: UriComponentsBuilder): String? {
    // TODO
    return null
  }

  /**
   * OAuth2.0のトークンエンドポイント。
   *
   * @param request
   * @return
   */
  @PostMapping("/oauth2/token")
  @ResponseBody
  fun token(request: Map<String, String>): Map<String, String>? {
    // TODO
    return null
  }

}
