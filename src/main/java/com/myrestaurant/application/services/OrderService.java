package com.myrestaurant.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myrestaurant.application.entities.Order;
import com.myrestaurant.application.repositories.OrderRepository;
import com.myrestaurant.application.repositories.UserRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}

	public Order findById(Long id){
		Optional<Order> obj =  orderRepository.findById(id);
		return obj.orElseThrow();
	}
}
