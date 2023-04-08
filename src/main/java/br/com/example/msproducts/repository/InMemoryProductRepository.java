package br.com.example.msproducts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.example.msproducts.model.Product;
import br.com.example.msproducts.service.ProductCreationService;
import br.com.example.msproducts.service.ProductRetrievalService;

@Repository
public class InMemoryProductRepository implements ProductRepository, ProductCreationService, ProductRetrievalService {

	private List<Product> products;
	
	@Override
	public Product save(Product product) {
		
		boolean add = products.add(product);
		
		if(add) {
			return product;
		}
		return null;
		
	}

	@Override
	public int delete(String id) {
		
		boolean removeIf = this.products.removeIf(product -> product.getId().equals(id));
		return removeIf ? 1 : 0;
		
	}

	@Override
	public List<Product> findById(String id) {
		return this.products.stream()
				.filter(product -> product.getId()
						.equals(id))
				.toList();
	}

	@Override
	public List<Product> findAll() {

		return this.products;
		
	}

}
