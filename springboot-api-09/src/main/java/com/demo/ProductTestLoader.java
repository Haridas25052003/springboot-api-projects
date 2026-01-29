package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.model.Product;
import com.demo.service.ProductService;

@Component
public class ProductTestLoader implements CommandLineRunner{

	@Autowired
	private ProductService ps;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p=new Product();
		p.setProductname("mobile");
		p.setProductprice(25000);
		
		ps.addProduct(p, 1);
		System.out.println("product added successfully");
		
	}

}
