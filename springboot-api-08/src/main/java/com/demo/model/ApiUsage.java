package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ApiUsage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int userId;
	private String apiName;
	private int requestCount;
	private String usageDate;
	
	
	@Override
	public String toString() {
		return "ApiUsage [userId=" + userId + ", apiName=" + apiName + ", requestCount=" + requestCount + ", usageDate="
				+ usageDate + ", id=" + id + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public int getRequestCount() {
		return requestCount;
	}
	public void setRequestCount(int requestCount) {
		this.requestCount = requestCount;
	}
	public String getUsageDate() {
		return usageDate;
	}
	public void setUsageDate(String usageDate) {
		this.usageDate = usageDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
}
