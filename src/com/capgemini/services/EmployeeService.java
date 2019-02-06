package com.capgemini.services;
import java.util.List;

import com.capgemini.beans.*;
import com.capgemini.exceptions.DuplicateIdEnteredException;
import com.capgemini.exceptions.InvalidIdEnteredException;
import com.capgemini.exceptions.NameDoesNotExistException;

public interface EmployeeService {

	Employee createEmployee(String name, String id,Address address) throws DuplicateIdEnteredException;
	List<Employee> searchByName(String name) throws NameDoesNotExistException;
}
