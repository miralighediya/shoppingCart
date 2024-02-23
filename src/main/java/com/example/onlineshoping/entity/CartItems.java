package com.example.onlineshoping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="cartitem")
public class CartItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long item_id;
	private long cart_id;  // (Foreign Key to Shopping Cart)
	private long product_id;   // (Foreign Key to Product)
	private int quantity;
	public long getItem_id() {
		return item_id;
	}
	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}
	public long getCart_id() {
		return cart_id;
	}
	public void setCart_id(long cart_id) {
		this.cart_id = cart_id;
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
	@Override
	public String toString() {
		return "CartItems [item_id=" + item_id + ", cart_id=" + cart_id + ", product_id=" + product_id + ", quantity="
				+ quantity + "]";
	}
	public CartItems(long item_id, long cart_id, long product_id, int quantity) {
		super();
		this.item_id = item_id;
		this.cart_id = cart_id;
		this.product_id = product_id;
		this.quantity = quantity;
	}
	
	
	
}
