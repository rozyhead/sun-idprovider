package jp.co.sunarch.apps.idprovider.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

/**
 * OAuth2.0の認可エンドポイント
 */
@Controller
public class OAuth2Controller {

  /**
   * OAuth2.0の認可エンドポイント。
   *
   * @param params
   */
  @GetMapping("/oauth2/authorize")
  public String authorize(@RequestParam Map<String, String> params,
                          UriComponentsBuilder uriComponentsBuilder) {
    // TODO
    return null;
  }

  /**
   * OAuth2.0のトークンエンドポイント。
   *
   * @param request
   * @return
   */
  @PostMapping("/oauth2/token")
  @ResponseBody
  public Map<String, String> token(Map<String, String> request) {
    // TODO
    return null;
  }

}
