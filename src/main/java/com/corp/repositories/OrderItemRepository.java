package com.corp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corp.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
