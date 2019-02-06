package com.capgemini.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.beans.Employee;

public class EmployeeRepoImp implements EmployeeRepo {

static HashMap<String,Employee> hashmap=new HashMap<>();

@Override
public boolean save(Employee employee) {
	String id=employee.getId();
	hashmap.put(id,employee);
	return true;
}

@Override
public List<Employee> findByName(String name) {
	List<Employee> sn=new ArrayList<>();
	for(Map.Entry<String,Employee> entry : hashmap.entrySet()){
		if(entry.getValue().getName().equals(name))
		{
			sn.add(entry.getValue());
		}
	}

	return sn;
}


}

	
