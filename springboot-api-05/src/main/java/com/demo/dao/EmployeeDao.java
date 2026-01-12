package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{

	List<Employee> findAll();
	
	List<Employee> getEmployeeById(int id);

	List<Employee> getEmployeeByName(String name);
	
	List<Employee> getEmployeeByCompany(String company);

	List<Employee> getEmployeeByIdAndName(int id,String name);

	List<Employee> getEmployeeByIdOrName(int id,String name);
	
	List<Employee> getEmployeeByDesignation(String designation);
	
	public void deleteEmployeeById(int id);
}
