package com.myrestaurant.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myrestaurant.application.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
