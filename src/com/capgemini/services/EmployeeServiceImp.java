package com.capgemini.services;
import java.util.List;

import com.capgemini.beans.*;
import com.capgemini.exceptions.DuplicateIdEnteredException;
import com.capgemini.exceptions.NameDoesNotExistException;
import com.capgemini.repo.*;

public class EmployeeServiceImp implements EmployeeService{
	
	EmployeeRepo employeeRepo;
	
	public EmployeeServiceImp(EmployeeRepo employeeRepo)
	{
		this.employeeRepo=employeeRepo;
	}


	public List<Employee> searchByName(String name) throws NameDoesNotExistException {
		
		if(employeeRepo.findByName(name).isEmpty())
			throw new NameDoesNotExistException();
		return employeeRepo.findByName(name);
		
		
	}


	public Employee createEmployee(String id,String name ,Address address) throws DuplicateIdEnteredException{
	
	 Employee employee=new Employee(address,id,name);
	 employee.setAddress(address);
	 employee.setName(name);
	 employee.setId(id);
	 if (employeeRepo.save(employee))
	 	{
			return employee;
	 	}
	return null;

	}	


}
