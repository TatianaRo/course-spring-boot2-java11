package com.myrestaurant.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myrestaurant.application.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
