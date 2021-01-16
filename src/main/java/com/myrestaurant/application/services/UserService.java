package com.myrestaurant.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myrestaurant.application.entities.User;
import com.myrestaurant.application.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findById(Long id){
		Optional<User> obj =  userRepository.findById(id);
		return obj.orElseThrow();
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
}
