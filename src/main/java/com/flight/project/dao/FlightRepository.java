package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.model.Flight;



public interface FlightRepository extends JpaRepository<Flight,Integer>{

}
