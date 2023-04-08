package br.com.example.msproducts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.example.msproducts.model.Product;

@Repository
public interface ProductRepository {
	
	Product save(Product product);
	
	int delete(String id);
	
	List<Product> findById(String id);
	
	List<Product> findAll();

}
