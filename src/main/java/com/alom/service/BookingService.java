package com.alom.service;

import com.alom.design.creational.factory.PaymentFactory;
import com.alom.design.creational.factory.PaymentService;

public class BookingService {

	public void processPayment(String paymentType, double amount) {
		PaymentService paymentService = PaymentFactory.createPayment(paymentType);
		paymentService.pay(amount);
	}
}
