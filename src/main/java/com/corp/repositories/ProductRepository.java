package com.corp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
