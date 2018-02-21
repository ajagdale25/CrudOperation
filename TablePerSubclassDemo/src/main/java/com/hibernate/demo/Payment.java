package com.hibernate.demo;


public class Payment 
{
    private int paymentId;
    private double ammount;
    
	public int getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
    
    
}
