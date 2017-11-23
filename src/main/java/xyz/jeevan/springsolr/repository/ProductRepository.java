package xyz.jeevan.springsolr.repository;

import java.util.List;
import org.springframework.data.solr.repository.SolrCrudRepository;
import xyz.jeevan.springsolr.domain.Product;

/**
 * @author jeevan
 */
public interface ProductRepository extends SolrCrudRepository<Product, String> {

  List<Product> findByName(String name);
}
