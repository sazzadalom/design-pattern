package com.alom.design.creational.abstract_factory;

public class RazorpayPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("processed payment via razorpay.");
	}

}
