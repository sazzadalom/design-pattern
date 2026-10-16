package com.alom.design.creational.abstract_factory;

public class PaymentService {

	private final PaymentFactory paymentFactory;
	public PaymentService(PaymentFactory paymentFactory) {
		this.paymentFactory = paymentFactory;
	}
	
	public void processPayment(double amount) {
		Payment payment = paymentFactory.createPayment(amount);
		payment.pay(amount);
	}
	
	public void processRefund(double amount) {
		Refund refund = paymentFactory.createRefund(amount);
		refund.refund(amount);
	}
}
