package com.alom.design.creational.prototype.shallow_copy;

import com.alom.design.creational.prototype.Address;

public class User implements Cloneable {

	private int id;
	private String name;
	private Address adress;
	
	public User(int id, String name, Address adress) {
		this.id = id;
		this.name = name;
		this.adress = adress;
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
	
	public Address getAdress() {
		return adress;
	}



	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}

	@Override
	public User clone() throws CloneNotSupportedException {
		return (User) super.clone();
	}


}

