package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.model.Fare;


public interface FareRepository extends JpaRepository<Fare,Integer>{

}
