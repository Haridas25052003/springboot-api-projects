package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
	List<Employee> getEmployeeById(int id);
	
	List<Employee> getEmployeeByName(String name);
	
	List<Employee> getEmployeeByCompany(String company);
	
	List<Employee> getEmployeeByIdAndName(int id,String name);
	
	List<Employee> getEmployeeByIdOrName(int id,String name);
	
	List<Employee> getEmployeeByDesignation(String designation);
	
	public void deleteEmployeeById(int id);

}
