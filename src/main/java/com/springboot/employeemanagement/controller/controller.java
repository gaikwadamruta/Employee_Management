package com.springboot.employeemanagement.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.employeemanagement.employee.employee;
import com.springboot.employeemanagement.service.service;

@RestController
@CrossOrigin ("*")
// we are using postman to do operation, for that we need to add cross origin annotation

public class controller {
	
	@Autowired
	private service service;

	//to call save method or to save new Employee
	@PostMapping(value="saveEmployee")
	public employee saveEmployee(@RequestBody employee employee)
	{
		System.out.println("its save");
		service.saveEmployee(employee);
		return employee;
		
	}
	
	//to find all Employees from database
	@GetMapping(value="getAllEmployee")
	public List<employee> findAllEmployee()
	{
		return service.findAllEmployee();
		
	}
	
	
	//to update employee
	@PutMapping("updateEmployee")
	public employee updateEmployee(@RequestBody employee employee)
	{
		return service.updateEmployee(employee);
	}
	
	//to delete Employee
	@DeleteMapping("deleteEmployee")
	public String deleteEmployee(@RequestParam int empid)
	{
		service.deleteEmployee(empid);
		return "Employee deleted";
	}
	
	
}
