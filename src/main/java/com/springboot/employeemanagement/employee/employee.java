
package com.springboot.employeemanagement.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.dialect.Dialect;

@Entity
@Table(name = "employee_table", catalog = "employee_database")
public class employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	private String empname;
	private String empdesignation;

	
	  public employee() 
	  {
		  super(); 
	  // TODO Auto-generated constructor stub 
	  }
	  
	  
	  public employee(int empid, String empname, String empdesignation) {
		  super();
		  this.empid = empid; 
		  this.empname = empname;
		  this.empdesignation =empdesignation;
	 }
	 



	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdesignation() {
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}

}
