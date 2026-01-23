package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.ApiUsage;

public interface ApiUsageService {

	ApiUsage findByUserIdAndApiNameUsageDate (
			int userId,
			String apiName,
			String usageDate
			);
	
	Optional<ApiUsage> findById(int id);
	
	List<ApiUsage> findByName(String name);
}
