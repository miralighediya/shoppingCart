package com.example.onlineshoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshoping.entity.product;

public interface ProductRepository extends JpaRepository<product, Long> {

}
