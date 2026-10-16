package com.alom.design.creational.prototype.deep_copy;

import com.alom.design.creational.prototype.Address;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp = new Employee(1000, "Sazzad Alom", new Address("Mumbai"));
		System.out.println(emp);
		Employee clone = emp.clone();
		clone.getAddress().setCity("Kolkata");
		System.out.println(clone);
		System.out.println(emp);
	}

}
