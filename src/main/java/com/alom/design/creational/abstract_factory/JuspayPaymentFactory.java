package com.alom.design.creational.abstract_factory;

public class JuspayPaymentFactory implements PaymentFactory {

	@Override
	public Payment createPayment(double amount) {
		return new JuspayPayment();
	}

	@Override
	public Refund createRefund(double amount) {
		return new JuspayRefund();
	}

}
