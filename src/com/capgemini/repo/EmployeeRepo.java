package com.capgemini.repo;
import java.util.List;

import com.capgemini.beans.*;

public interface EmployeeRepo {

	boolean save(Employee employee);
	List<Employee> findByName(String name);
	

}
