package com.aula.spring_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.spring_jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
