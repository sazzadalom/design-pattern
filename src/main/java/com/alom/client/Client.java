package com.alom.client;

import com.alom.design.constant.Constant;
import com.alom.service.BookingService;

public class Client {

	public static void main(String...args) {
		BookingService bookingService = new BookingService();
//		bookingService.processPayment(Constant.PROVIDER_JUSPAY, 1000);
		bookingService.processPayment(Constant.PROVIDER_RAZORPAY, 2000);
	}
}
