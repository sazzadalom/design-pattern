package com.alom.design.creational.abstract_factory;

public class Client {

	public static void main(String[] args) {
		PaymentFactory factory = new RazorpayPaymentFactory();
		PaymentService service = new PaymentService(factory);
//		service.processPayment(10000.00);
		service.processRefund(200);
	}

}
