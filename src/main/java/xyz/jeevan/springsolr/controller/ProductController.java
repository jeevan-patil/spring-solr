package xyz.jeevan.springsolr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.jeevan.springsolr.domain.Product;
import xyz.jeevan.springsolr.service.ProductService;

/**
 * @author jeevan
 */
@RestController
@RequestMapping(value = "product")
public class ProductController {

  @Autowired
  private ProductService productService;

  @RequestMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Product> createProducts() {
    return new ResponseEntity<>(productService.create(null), HttpStatus.OK);
  }
}
