package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao ed;

	@Override
	public List<Employee> findAll() {
		
		return ed.findAll();
	}

	@Override
	public List<Employee> getEmployeeById(int id) {
		
		return ed.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		
		return ed.getEmployeeByName(name);
	}

	@Override
	public List<Employee> getEmployeeByCompany(String company) {
		
		return ed.getEmployeeByCompany(company);
	}

	@Override
	public List<Employee> getEmployeeByIdAndName(int id, String name) {
		
		return ed.getEmployeeByIdAndName(id, name);
	}

	@Override
	public List<Employee> getEmployeeByIdOrName(int id, String name) {
		
		return ed.getEmployeeByIdOrName(id, name);
	}

	@Override
	public List<Employee> getEmployeeByDesignation(String designation) {
		
		return ed.getEmployeeByDesignation(designation);
	}

	@Override
	@Transactional
	public void deleteEmployeeById(int id) {
		
		ed.deleteEmployeeById(id);
	}

}
