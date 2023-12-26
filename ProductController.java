package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/Products")
public class ProductController {
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/addproduct")
	public Product addproduct(@RequestBody Product product) {
		return productservice.addProduct(product);
	}
	@GetMapping("/allproducts")
	public List<Product> getAllProducts(){
		return productservice.allproducts();
		
	}

}
