package com.alom.design.creational.factory;

import com.alom.design.constant.Constant;

public class PaymentFactory {

	public static PaymentService createPayment(String type) {
		
		 switch(type) {
				case Constant.PROVIDER_JUSPAY : return new JuspayService();
				case Constant.PROVIDER_RAZORPAY : return new RazorpayService();
				default : throw new IllegalArgumentException(Constant.UNSUPPORTED_PAYMENT_TYPE);
		}
	}
}
