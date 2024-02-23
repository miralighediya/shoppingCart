package com.example.onlineshoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshoping.entity.OrderItems;

public interface OrderItemRepository extends JpaRepository<OrderItems, Long>{

}
