package xyz.jeevan.springsolr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jeevan
 */
@Controller
public class HomeController {

  @RequestMapping(value = "/")
  public ResponseEntity<String> home() {
    return new ResponseEntity<>("Up and running", HttpStatus.OK);
  }
}
