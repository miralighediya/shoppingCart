package com.example.onlineshoping.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="orders")
public class Order {

	
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long order_id;
	private String customer_mobile_number;
	private  LocalDateTime  order_date;
	private String status;
	private double total_amout;
	private String shipping_address;
	
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public String getCustomer_mobile_number() {
		return customer_mobile_number;
	}
	public void setCustomer_mobile_number(String customer_mobile_number) {
		this.customer_mobile_number = customer_mobile_number;
	}
	public LocalDateTime getOrder_date() {
		return order_date;
	}
	public void setOrder_date(LocalDateTime order_date) {
		this.order_date = order_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotal_amout() {
		return total_amout;
	}
	public void setTotal_amout(double total_amout) {
		this.total_amout = total_amout;
	}
	public String getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", customer_mobile_number=" + customer_mobile_number + ", order_date="
				+ order_date + ", status=" + status + ", total_amout=" + total_amout + ", shipping_address="
				+ shipping_address + "]";
	}
	public Order(long order_id, String customer_mobile_number, LocalDateTime order_date, String status,
			double total_amout, String shipping_address) {
		super();
		this.order_id = order_id;
		this.customer_mobile_number = customer_mobile_number;
		this.order_date = order_date;
		this.status = status;
		this.total_amout = total_amout;
		this.shipping_address = shipping_address;
	}
	
	
	
	
	
}
