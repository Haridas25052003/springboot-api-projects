
package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.ApiUsage;

public interface ApiUsageDao extends JpaRepository<ApiUsage,Integer>{

	ApiUsage findByUserIdAndApiNameUsageDate (
			int userId,
			String apiName,
			String usageDate
			);

	List<ApiUsage> findByName(String name);
	
	
	
}
/*
 *in this dao package extends jpareposity with the class
 *name and wrapper class while we have to construct
 *all the instance variable from user class 
 *ApiUsage findByUserIdAndApiNameAndUsageDate(
 *         int userId,
 *         String apiName,
 *         String usageDate
 * );
 * 
 * 
 * 
 * */

