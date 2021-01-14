package com.myrestaurant.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myrestaurant.application.entities.Category;
import com.myrestaurant.application.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}

	public Category findById(Long id){
		Optional<Category> obj =  categoryRepository.findById(id);
		return obj.orElseThrow();
	}
}
