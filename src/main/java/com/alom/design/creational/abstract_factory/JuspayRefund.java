package com.alom.design.creational.abstract_factory;

public class JuspayRefund implements Refund {

	@Override
	public void refund(double amount) {
		System.out.println("refund processed via juspay.");
	}

}
