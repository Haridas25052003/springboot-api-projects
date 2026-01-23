package com.demo.model;

public class User {
 
	private int id;
	private String email;
	private String role;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", role=" + role + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}	
}
