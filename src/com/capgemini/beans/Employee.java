package com.capgemini.beans;

public class Employee {

	Address address;
	private	String name;
	private String id;
	
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", name=" + name + ", id=" + id + "]";
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Employee(Address address, String name, String id) {
		super();
		this.address = address;
		this.name = name;
		this.id = id;
	}

	
}
