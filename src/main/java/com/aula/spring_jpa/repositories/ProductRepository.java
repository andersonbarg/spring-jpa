package com.aula.spring_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.spring_jpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
