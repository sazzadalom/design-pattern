package com.alom.design.creational.factory;

public class JuspayService implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("Processing payment via juspay.");
	}

}
