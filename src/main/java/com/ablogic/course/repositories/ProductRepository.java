package com.ablogic.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ablogic.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
