package com.alom.design.creational.prototype.deep_copy;

import com.alom.design.creational.prototype.Address;


/**
 * 
 * <p>Creating an object by coping an existing object. </p>
 * 
 * @author sazzad.alom
 * @since 2026
 * @version 1.0.0
 * 
 * */

public class Employee implements Cloneable {

	private int id;
	private String name;
	private Address address;
	
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Employee clone() throws CloneNotSupportedException {
		Employee clone = (Employee) super.clone();
		clone.address = new Address(this.address.getCity());
		return clone;
	}
}
