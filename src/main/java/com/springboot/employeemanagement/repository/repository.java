package com.springboot.employeemanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employeemanagement.employee.employee;

@Repository
public interface repository extends CrudRepository<employee, Integer> {
	
	

}
