package com.alom.design.creational.prototype.shallow_copy;

import com.alom.design.creational.prototype.Address;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		User usr = new User(100,"Sazzad Alom",new Address("Mumbai"));
		System.out.println(usr);
		User clone = usr.clone();
		clone.getAdress().setCity("Kolkata");
		System.out.println(usr);
		System.out.println(clone);
		
		
	}
}
