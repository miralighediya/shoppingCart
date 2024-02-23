package com.example.onlineshoping.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long payment_id; 
	private long order_id;   //((Foreign Key to Order)
	private LocalDateTime payment_date;
	private Double amount;
	private String payment_status;   // (e.g., successful, pending)
	
	public long getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(long payment_id) {
		this.payment_id = payment_id;
	}
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public LocalDateTime getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(LocalDateTime payment_date) {
		this.payment_date = payment_date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public Payment(long payment_id, long order_id, LocalDateTime payment_date, Double amount, String payment_status) {
		super();
		this.payment_id = payment_id;
		this.order_id = order_id;
		this.payment_date = payment_date;
		this.amount = amount;
		this.payment_status = payment_status;
	}
	
	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", order_id=" + order_id + ", payment_date=" + payment_date
				+ ", amount=" + amount + ", payment_status=" + payment_status + "]";
	}
}
