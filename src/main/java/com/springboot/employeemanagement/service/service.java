package com.springboot.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.employeemanagement.employee.employee;
import com.springboot.employeemanagement.repository.repository;
import com.springboot.employeemanagement.serviceInterface.serviceInterface;

@Service
public class service implements serviceInterface{
	
	@Autowired 
	private repository repository;

	@Override
	public employee saveEmployee(employee employee) {
		// TODO Auto-generated method stub
		return repository.save(employee); //to save
	}

	@Override
	public employee updateEmployee(employee employee) {
		// TODO Auto-generated method stub
		return repository.save(employee);   //to update
	}

	@Override
	public List<employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return (List<employee>) repository.findAll(); 
	}

	
	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		repository.deleteById(empid);   
	
	}

}
