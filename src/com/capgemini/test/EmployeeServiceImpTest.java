package com.capgemini.test;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.exceptions.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.repo.EmployeeRepo;
import com.capgemini.services.EmployeeService;
import com.capgemini.services.EmployeeServiceImp;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
public class EmployeeServiceImpTest {
	
	EmployeeService employeeService;

	@Mock
	EmployeeRepo employeeRepo;
	
	@Before
	public void setUp() throws Exception {
	
		MockitoAnnotations.initMocks(this);
		employeeService=new EmployeeServiceImp(employeeRepo);
	}

	/*	  
	 *   -----------------When the searched name is not available in the list collection--------------------------
	 * 
	 */
	
	@Test(expected=com.capgemini.exceptions.NameDoesNotExistException.class)
	public void whensearchedNameDoesNotExist() throws NameDoesNotExistException, DuplicateIdEnteredException
	{
		City city=new City("Pune");
		Country country=new Country("INDIA",city);
		Address address=new Address("Talwade",country);
		System.out.println(employeeService.createEmployee("101", "Abhinav Singh Bhadauria", address));
		
		employeeService.searchByName("Akarsh");
	}

	/*
	 * ----------------when user wants to add details for an employee but that specific ID is already exist in the collection------------ 
	 * 
	 */
	
	@Test(expected=com.capgemini.exceptions.DuplicateIdEnteredException.class)
	public void whenTheEnterdIdIsPreExistedInCollection() throws DuplicateIdEnteredException
	
	{
		City city=new City("Pune");
		Country country=new Country("INDIA",city);
		Address address=new Address("Talwade",country);
		System.out.println(employeeService.createEmployee("101", "Abhinav Singh Bhadauria", address));
		
		City city1=new City("Lucknow");
		Country country1=new Country("INDIA",city);
		Address address1=new Address("Gomti Nagar",country1);
		System.out.println(employeeService.createEmployee("102", "Aditya Nath Singh", address1));
		
		employeeService.createEmployee("Anurag", "101", address1);
	}
	
}
