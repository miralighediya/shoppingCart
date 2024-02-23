package com.example.onlineshoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshoping.entity.CartItems;

public interface CartItemRepository extends JpaRepository<CartItems, Long> {


}
