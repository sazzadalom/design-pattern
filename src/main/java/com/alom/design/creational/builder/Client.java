package com.alom.design.creational.builder;

public class Client {

	public static void main(String[] args) {
		
		Employee employee = Employee.builder().id(100).salary(20000.00).name("Rajeev Shishodia").build();
		System.out.println(employee);
	}

}
