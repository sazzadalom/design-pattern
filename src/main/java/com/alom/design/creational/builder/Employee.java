package com.alom.design.creational.builder;


/*
 * <p>Construct complex objects step by step. </p>
 * @author sazzad.alom
 * @since 2026
 * @version 1.0.0
 * 
 * 
 */
public class Employee {

	private final int id;
	private final String name;
	private final double salary;
	
	private Employee(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.salary = builder.salary;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private int id;
		private String name;
		private double salary;
		
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
		
	}
	
	@Override
	public String toString() {
		return "Builder [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
