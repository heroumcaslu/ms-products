package br.com.example.msproducts.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.example.msproducts.model.Product;

@Repository
public interface MongoProductRepository extends MongoRepository<Product, String> {

}
