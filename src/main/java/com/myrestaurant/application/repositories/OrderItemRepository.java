package com.myrestaurant.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myrestaurant.application.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
