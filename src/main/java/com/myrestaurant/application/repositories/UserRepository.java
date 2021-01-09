package com.myrestaurant.application.repositories;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import com.myrestaurant.application.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
