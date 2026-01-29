package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@PostMapping("/req1/categoryId")
	public Product m1(@RequestBody Product product,
			@PathVariable int categoryId) {
		return ps.addProduct(product, categoryId);
	}
	
	@GetMapping("/req2")
	public List<Product> m3(){
		return ps.getAllProducts();
	}
  	
	@PutMapping("/req3/{id}")
	public Product updateProduct(
			@PathVariable int id,
			@RequestBody Product product) {
		
		return ps.updateProduct(id, product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		ps.deleteProduct(id);
		return "product deleted successfully";
	}
}
