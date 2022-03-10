package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.model.Passenger;



public interface PassengerRepository extends JpaRepository<Passenger,Integer>{

}
