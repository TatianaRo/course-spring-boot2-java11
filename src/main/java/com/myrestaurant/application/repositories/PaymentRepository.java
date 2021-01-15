package com.myrestaurant.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myrestaurant.application.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
