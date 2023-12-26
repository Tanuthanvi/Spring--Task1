package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}
	@Autowired
	private ProductRepository productRepository;
	
	public void run(String...args)throws Exception{
		Product prod=new Product();
		prod.setId(10);
		prod.setName("Rice Packets");
		prod.setQuantity(400);
		prod.setPrice(650.45);
		productRepository.save(prod);
		
		Product prod1=new Product();
		prod1.setId(11);
		prod1.setName("Chocolates");
		prod1.setQuantity(45);
		prod1.setPrice(150.35);
		productRepository.save(prod1);
		
		Product prod2=new Product();
		prod2.setId(12);
		prod2.setName("Biscuits");
		prod2.setQuantity(16);
		prod2.setPrice(55.98);
		productRepository.save(prod2);
		
	}

}
