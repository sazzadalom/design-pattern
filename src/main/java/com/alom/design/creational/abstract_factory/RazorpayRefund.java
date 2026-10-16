package com.alom.design.creational.abstract_factory;

public class RazorpayRefund implements Refund {

	@Override
	public void refund(double amount) {
		System.out.println("processed refund via razorpay.");
	}

}
