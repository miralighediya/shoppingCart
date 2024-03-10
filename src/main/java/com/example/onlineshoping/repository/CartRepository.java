package com.example.onlineshoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshoping.entity.cart;

public interface CartRepository extends JpaRepository<cart, Long> {
	cart findBymobilenumber(String mobileNumber);
}
