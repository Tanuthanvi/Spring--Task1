package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
@Service
public abstract class ProductServiceImpl  implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
		
		}
	
	public List<Product> allproducts(){
		return productRepository.findAll();
	}
	}


