package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryDao;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pd;
	
	@Autowired
	private CategoryDao cd;

	@Override
	public Product addProduct(Product product, int categoryId) {
		
		Category category=cd.getById(categoryId);
				//.orElseThrow(()->new RuntimeException("category not found"));
		
		product.setCategory(category);
		return pd.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return pd.findAll();
	}

	@Override
	public Product updateProduct(int productId, Product product) {
		
		Product existing=pd.getById(productId);
				//.orElseThrow(()->new RuntimeException("product not found"));
		
		existing.setProductname(product.getProductname());
		existing.setProductprice(product.getProductprice());
		return pd.save(existing);
	}

	@Override
	public void deleteProduct(int productId) {
		
		pd.deleteById(productId);
	}	
}
