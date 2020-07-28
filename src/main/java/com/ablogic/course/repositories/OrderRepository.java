package com.ablogic.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ablogic.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
