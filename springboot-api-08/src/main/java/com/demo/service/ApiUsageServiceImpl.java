package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ApiUsageDao;
import com.demo.model.ApiUsage;

@Service
public class ApiUsageServiceImpl implements ApiUsageService{

	@Autowired
	private ApiUsageDao ad;
	
	@Override
	public ApiUsage findByUserIdAndApiNameUsageDate(int userId, String apiName, String usageDate) {
		
		return ad.findByUserIdAndApiNameUsageDate(userId, apiName, usageDate);
	}

	@Override
	public Optional<ApiUsage> findById(int id) {
		
		return ad.findById(id);
	}

	@Override
	public List<ApiUsage> findByName(String name) {
		
		return ad.findByName(name);
	}

}
