package xyz.jeevan.springsolr.service;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jeevan.springsolr.domain.Product;
import xyz.jeevan.springsolr.repository.ProductRepository;

/**
 * @author jeevan
 */
@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public Product create(Product product) {
    for (int i = 0; i < 1000; i++) {
      product = new Product();
      product.setId(getUniqueString());
      product.setName(getUniqueString());
      productRepository.save(product);
    }
    return product;
  }

  private String getUniqueString() {
    return UUID.randomUUID().toString();
  }
}
