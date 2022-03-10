package com.flight.project.service;


import java.util.List;

import org.springframework.http.ResponseEntity;

import com.flight.project.exceptions.FlightNotFoundException;
import com.flight.project.model.Flight;


public interface FlightService {
	
	public Flight addFlight(Flight flight);
	public void delFlight(Integer flight);
	public void updateFlight(Flight flight,Integer flightId);
	
	public ResponseEntity<Flight> searchFlight(Integer flightId) throws FlightNotFoundException;
	
	public List<Flight> viewAllFlights();
	
	
	
//	public Route addRoute(Route route);
//	public Route updateRoute(Route route);
//	
//	public Optional<Route> searchRoute(Long routeId);
//	public List<Route> viewRoute();
//	String removeRoute(Long routeId);

}
