package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.model.Payment;



public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
