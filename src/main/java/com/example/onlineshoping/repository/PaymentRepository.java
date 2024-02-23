package com.example.onlineshoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshoping.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
