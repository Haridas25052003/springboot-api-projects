package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ApiLimitConfig {

	@Id
	private String role;
	private int dailyLimit;
	
	@Override
	public String toString() {
		return "ApiLimitConfig [role=" + role + ", dailyLimit=" + dailyLimit + "]";
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(int dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
}	
	
