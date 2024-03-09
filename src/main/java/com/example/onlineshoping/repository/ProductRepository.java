package com.example.onlineshoping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshoping.entity.category;
import com.example.onlineshoping.entity.product;

public interface ProductRepository extends JpaRepository<product, Long> {
	List<product> findBycategory(category category_id);

}
