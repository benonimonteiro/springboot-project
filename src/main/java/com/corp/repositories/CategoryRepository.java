package com.corp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
