package br.com.example.msproducts.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.msproducts.model.Product;
import br.com.example.msproducts.repository.ProductRepository;

@RestController
@RequestMapping("products")
public class ProductController  {
	
	private ProductRepository productRepository;
	
	public ProductController(@Qualifier("databaseProductRepository") ProductRepository productRepository){
		this.productRepository = productRepository;
	}
		
	
	@PostMapping
	public ResponseEntity<?> createProduct(@RequestBody Product product) {

		return ResponseEntity.ok(productRepository.save(product));

	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		
		return ResponseEntity.ok(productRepository.findAll());
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findProductById(@PathVariable String id) {

		return ResponseEntity.ok(productRepository.findById(id));

	}
	
	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {

		return ResponseEntity.ok(productRepository.save(product));

	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable String id) {

		return ResponseEntity.ok(productRepository.delete(id));

	}
	
}
