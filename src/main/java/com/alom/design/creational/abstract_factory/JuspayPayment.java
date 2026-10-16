package com.alom.design.creational.abstract_factory;

public class JuspayPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("payment process via juspay.");
	}

}
