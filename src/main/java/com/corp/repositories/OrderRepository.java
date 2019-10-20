package com.corp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corp.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
