package com.example.onlineshoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshoping.entity.category;

public interface CategoryRepository extends JpaRepository<category, Long> {
	

}
