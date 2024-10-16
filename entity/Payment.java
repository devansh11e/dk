package com.hexaware.carrental.entity;

import java.sql.Date;

public class Payment {
	 private int paymentId;
	 private Date paymentDate;
	 private double amount;
	public Payment() {
		super();
	}
	public Payment(int paymentId, Date paymentDate, double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", amount=" + amount + "]";
	}
	 

}
