package com.example.onlineshoping.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_id;
	private String name;
	
	//@JsonIgnore
	//@OneToMany(mappedBy = "category")
	//private List<product> product;
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "category [category_id=" + category_id + ", name=" + name + "]";
	}
	public category(int category_id, String name) {
		super();
		this.category_id = category_id;
		this.name = name;
	}
	
	public category()
	{
		
	}
}
