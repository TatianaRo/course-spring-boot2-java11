package com.myrestaurant.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.myrestaurant.application.entities.User;
import com.myrestaurant.application.repositories.UserRepository;
import com.myrestaurant.application.services.exceptions.DataBaseException;
import com.myrestaurant.application.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findById(Long id){
		Optional<User> obj =  userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		try {
		userRepository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
	    }catch(DataIntegrityViolationException e) {
	    	throw new DataBaseException(e.getMessage());
	    }
	}
	
	public User update(Long id, User user) {
		User entity = userRepository.getOne(id);
		updateUser(entity, user);
		return userRepository.save(entity);
	}

	private void updateUser(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());		
	}	
}
