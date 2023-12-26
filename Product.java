package com.example.demo;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="Prod")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int quantity;
	private double price;
	public Product() {
		super();
	}
	public Product(int id,String name,int quantity,double price) {
		super();
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id=id;
	}
    public String getName() {
	   return name;
	}
    public void setName(String string) {
    	this.name=name;
    }
    public int getQuantity() {
    	return quantity;
    }
    public void setQuantity(int i) {
    	this.quantity=quantity;
    }
    public double getPrice() {
    	return price;
    }
    public void setPrice(double d) {
    	this.price=price;
    }
	public void setId1(int i) {
		// TODO Auto-generated method stub
		return;
	}
    
}
