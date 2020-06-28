package com.springboot.employeemanagement.serviceInterface;

import java.util.List;

import com.springboot.employeemanagement.employee.employee;

public interface serviceInterface {
	
	//to save new Employee
	public employee saveEmployee(employee employee);
	
	//to update Employee
	public employee updateEmployee(employee employee);
	
	//to fetch all Employee
	public List<employee> findAllEmployee();
	
	
	//to delete Employee
	public void deleteEmployee(int empid);
	
	

}
