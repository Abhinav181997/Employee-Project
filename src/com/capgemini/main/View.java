package com.capgemini.main;

import com.capgemini.beans.*;
import com.capgemini.exceptions.DuplicateIdEnteredException;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.repo.EmployeeRepoImp;
import com.capgemini.services.*;

public class View {

	public static void main(String[] args) throws Exception {
	   
		EmployeeRepo employeeRepo=new EmployeeRepoImp();
		EmployeeService employeeService=new EmployeeServiceImp(employeeRepo);
		
		City city=new City("Pune");
		Country country=new Country("INDIA",city);
		Address address=new Address("Talwade",country);
		System.out.println(employeeService.createEmployee("101", "Abhinav Singh Bhadauria", address));
		
		City city1=new City("Lucknow");
		Country country1=new Country("INDIA",city);
		Address address1=new Address("Gomti Nagar",country1);
		System.out.println(employeeService.createEmployee("102", "Aditya Nath Singh", address1));
	
	}

}
