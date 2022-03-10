package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.model.Location;



public interface LocationRepository extends JpaRepository<Location,Integer>{

}
