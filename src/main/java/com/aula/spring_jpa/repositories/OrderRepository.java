package com.aula.spring_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.spring_jpa.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
