package com.example.onlineshoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshoping.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
