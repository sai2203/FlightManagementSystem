package com.flight.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flight.project.dao.FlightRepository;
import com.flight.project.exceptions.FlightNotFoundException;
import com.flight.project.model.Flight;
import com.flight.project.service.FlightService;


@Service
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	private FlightRepository flightRepository;
	
	
	

	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepository.save(flight);
		
	}

	@Override
	public void delFlight(Integer flight) {
		// TODO Auto-generated method stub
		
		flightRepository.deleteById(flight);
		
	}

	@Override
	public void updateFlight(Flight flight,Integer flightId) {
		// TODO Auto-generated method stub
		flight.setFlightId(flightId);
		flightRepository.save(flight);
		
	}
	
//	public void updateFlight(Flight flight, Integer flight_id) {
//		// TODO Auto-generated method stub
//		flight.setFlightId(flight_id);
//		flightRepository.save(flight);
//		
//	}

	@Override
	public ResponseEntity<Flight> searchFlight(Integer flightId)throws FlightNotFoundException {
		// TODO Auto-generated method stub
		
		
		 Flight newFlight=flightRepository.findById(flightId).orElseThrow(() -> new FlightNotFoundException("Flight ID :: " + flightId + " Not Found"));
		 return ResponseEntity.ok().body(newFlight);
	}

	@Override
	public List<Flight> viewAllFlights() {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}

	

}
