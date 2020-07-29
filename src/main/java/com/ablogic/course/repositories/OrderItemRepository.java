package com.ablogic.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ablogic.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
