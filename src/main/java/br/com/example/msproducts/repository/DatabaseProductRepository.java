package br.com.example.msproducts.repository;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.example.msproducts.model.Product;
import br.com.example.msproducts.service.ProductCreationService;
import br.com.example.msproducts.service.ProductRetrievalService;

@Repository
public class DatabaseProductRepository implements ProductRepository, ProductCreationService, ProductRetrievalService {

	
	private MongoRepository<Product, String> mongoRepository;
	
	public DatabaseProductRepository(MongoRepository<Product, String> mongoRepository) {
		this.mongoRepository = mongoRepository;
	}
	
	@Override
	public Product save(Product product) {
		return this.mongoRepository.save(product);
	}

	@Override
	public int delete(String id) {
		this.mongoRepository.deleteById(id);
		return 1;
	}

	@Override
	public List<Product> findById(String id) {
		return this.mongoRepository.findById(id).stream().toList();
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.mongoRepository.findAll();
	}

}
