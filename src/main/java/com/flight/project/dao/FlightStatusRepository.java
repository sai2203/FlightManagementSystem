package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.model.FlightStatus;



public interface FlightStatusRepository extends JpaRepository<FlightStatus,Integer>{

}
