package com.alom.design.creational.abstract_factory;

public class RazorpayPaymentFactory implements PaymentFactory {

	@Override
	public Payment createPayment(double amount) {
		return new RazorpayPayment();
	}

	@Override
	public Refund createRefund(double amount) {
		return new RazorpayRefund();
	}

}
