package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.model.Booking;



public interface BookingRepository extends JpaRepository<Booking,Integer>{
	

}
