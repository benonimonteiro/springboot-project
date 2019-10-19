package com.corp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
