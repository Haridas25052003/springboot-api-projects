package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	@GetMapping(value="/")
	public List<Employee> m1(){
		return es.findAll();
	}
	
	@GetMapping(value="/req1/{id}")
	public List<Employee> m2(@PathVariable int id){
		return es.getEmployeeById(id);
	}
	
	@GetMapping(value="/req2/{name}")
	public List<Employee> m3(@PathVariable String name){
		return es.getEmployeeByName(name);
	}
	
	@GetMapping(value="/req3/{company}")
	public List<Employee> m4(@PathVariable String company){
		return es.getEmployeeByCompany(company);
	}

	@GetMapping(value="/req4/{id}/{name}")
	public List<Employee> m5(@PathVariable int id, @PathVariable String name){
		return es.getEmployeeByIdAndName(id, name);
	}
	
	@GetMapping(value="/req5/{id}/{name}")
	public List<Employee> m6(@PathVariable int id,@PathVariable String name){
		return es.getEmployeeByIdOrName(id, name);
	}
	
	@GetMapping(value="/req6/{designation}")
	public List<Employee> m7(@PathVariable String designation){
		return es.getEmployeeByDesignation(designation);
	}
	
	@GetMapping(value="/req7/{id}")
	public int m8(@PathVariable int id) {
		es.deleteEmployeeById(id);
		return 1;
	}
}
