package com.example.onlineshoping.entity;

import java.time.LocalDateTime;
import java.util.Locale.Category;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long product_id;
	private String name;
	private String description;
	private Double price;
	private int  quantity_in_stock;
	private int reserved_quantity;
	

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "category_id")
	private Category category;
	private String brand;
	private LocalDateTime created_at;
	private LocalDateTime updated_at;
	
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long
			product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}
	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}
	public int getReserved_quantity() {
		return reserved_quantity;
	}
	public void setReserved_quantity(int reserved_quantity) {
		this.reserved_quantity = reserved_quantity;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "product [product_id=" + product_id + ", name=" + name + ", description=" + description + ", price="
				+ price + ", quantity_in_stock=" + quantity_in_stock + ", reserved_quantity=" + reserved_quantity
				+ ", category=" + category + ", brand=" + brand + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
	
	public product(long product_id, String name, String description, Double price, int quantity_in_stock,
			int reserved_quantity, Category category, String brand, LocalDateTime created_at, LocalDateTime updated_at) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity_in_stock = quantity_in_stock;
		this.reserved_quantity = reserved_quantity;
		this.category = category;
		this.brand = brand;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public product()
	{
		
	}
	
	
}
