package com.example.onlineshoping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderitem")
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long item_id;   
	private long order_id;   // (Foreign Key to Order)
	private long product_id;   // (Foreign Key to Product)
	private int quantity;
	private Double Dunit_price;
	public long getItem_id() {
		return item_id;
	}
	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getDunit_price() {
		return Dunit_price;
	}
	public void setDunit_price(Double dunit_price) {
		Dunit_price = dunit_price;
	}
	@Override
	public String toString() {
		return "OrderItems [item_id=" + item_id + ", order_id=" + order_id + ", product_id=" + product_id
				+ ", quantity=" + quantity + ", Dunit_price=" + Dunit_price + "]";
	}
	public OrderItems(long item_id, long order_id, long product_id, int quantity, Double dunit_price) {
		super();
		this.item_id = item_id;
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
		Dunit_price = dunit_price;
	}
	
	
}
