package com.spring.springaop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {

	public EmployeeDTO getEmployeeById(Integer empId){
		System.out.println("getEmployeeById() called");
		return new EmployeeDTO();
		}
	
	public void createEmployee(EmployeeDTO employee){
		System.out.println("createEmployee() called");
	}
	
	public void deleteEmployee(Integer empID){
		System.out.println("deleteEmployee() called");
	}
	
	public void updateEmployee(EmployeeDTO employee){
		System.out.println("deleteEmployee() called");
	}
	}

