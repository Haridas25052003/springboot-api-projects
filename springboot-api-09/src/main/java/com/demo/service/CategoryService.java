package com.demo.service;

import java.util.List;

import com.demo.model.Category;

public interface CategoryService {

	Category addCategory(Category category);
	
	List<Category> findAll();
	
	Category updateCategory(int id,Category category);
	
	void deleteCategory(int id);
}
