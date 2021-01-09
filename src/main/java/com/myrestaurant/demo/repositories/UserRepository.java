package com.myrestaurant.demo.repositories;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import com.myrestaurant.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
