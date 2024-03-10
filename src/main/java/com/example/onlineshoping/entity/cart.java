package com.example.onlineshoping.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart")
public class cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private int cart_id;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CartItems> cartItems = new ArrayList<>();

	@Column(name = "customer_mobile_number")
	private String customer_mobile_number;
	private LocalDateTime created_at;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getCustomer_mobile_number() {
		return customer_mobile_number;
	}

	public void setCustomer_mobile_number(String customer_mobile_number) {
		this.customer_mobile_number = customer_mobile_number;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "cart [cart_id=" + cart_id + ", customer_mobile_number=" + customer_mobile_number + ", created_at="
				+ created_at + "]";
	}

	public cart(int cart_id, String customer_mobile_number, LocalDateTime created_at) {
		super();
		this.cart_id = cart_id;
		this.customer_mobile_number = customer_mobile_number;
		this.created_at = created_at;
	}

	public cart() {

	}

}
