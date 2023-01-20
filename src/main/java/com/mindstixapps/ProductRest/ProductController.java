package com.mindstixapps.ProductRest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @Autowired
  private ProductService service;


  @GetMapping("/products")
  public List<Product> list() {
    return service.listAll();
  }

  @GetMapping("/product/{id}")
  public ResponseEntity<Product> listById(@PathVariable Integer id) {
    try {
      Product product = service.get(id);
      return new ResponseEntity<Product>(product, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
    }

  }

  @PostMapping("/products")
  public void addProduct(@RequestBody Product product) {
    service.save(product);
  }

}
