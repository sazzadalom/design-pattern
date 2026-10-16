package com.alom.design.creational.abstract_factory;

/**
 * <p> Provides an interface for creating families of related objects without specifying their concrete classes. </p>
 * 
 * @author sazzad.alom
 * @since 2026
 * @version 1.0.0
 * 
 */


public interface PaymentFactory {

	Payment createPayment(double amount);
	
	Refund createRefund(double amount);
}
