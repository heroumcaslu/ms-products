package br.com.example.msproducts.service;

import org.springframework.stereotype.Service;

import br.com.example.msproducts.model.Product;

@Service
public interface ProductCreationService {
	
	Product save(Product produc);

}
