package br.com.example.msproducts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.example.msproducts.model.Product;

@Service
public interface ProductRetrievalService {
	
	List<Product> findById(String id);

}
