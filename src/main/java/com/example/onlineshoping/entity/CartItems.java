package com.example.onlineshoping.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cartitem")
public class CartItems {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cartitem_id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private product product_id; // (Foreign Key to Product)

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_id")
	@JsonIgnore
	private cart cart;

	public product getProduct_id() {
		return product_id;
	}

	public void setProduct_id(product product_id) {
		this.product_id = product_id;
	}

	public cart getCart() {
		return cart;
	}

	public void setCart(cart cart) {
		this.cart = cart;
	}

	public CartItems() {
	}

	public long getCartitem_id() {
		return cartitem_id;
	}

	public void setCartitem_id(long cartitem_id) {
		this.cartitem_id = cartitem_id;
	}

	@Override
	public String toString() {
		return "CartItems [cartitem_id=" + cartitem_id + ", product_id=" + product_id + ", cart=" + cart + "]";
	}

	public CartItems(long cartitem_id, product product_id, com.example.onlineshoping.entity.cart cart) {
		super();
		this.cartitem_id = cartitem_id;
		this.product_id = product_id;
		this.cart = cart;
	}

}
