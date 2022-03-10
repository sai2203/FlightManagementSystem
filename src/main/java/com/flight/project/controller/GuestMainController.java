package com.flight.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.project.exceptions.FlightNotFoundException;
import com.flight.project.model.Flight;
import com.flight.project.service.FlightService;

@RestController
@RequestMapping("/api/Guest")
public class GuestMainController {
	@Autowired
	FlightService flightService;

	@GetMapping("/viewAllFlights")
	public List<Flight> getAllFlights() {
		return flightService.viewAllFlights();
	}

	@GetMapping("/searchFlight/{id}")
	public ResponseEntity<Flight> getFlight(@PathVariable("id") Integer flightId) throws FlightNotFoundException {
		return flightService.searchFlight(flightId);
	}

}
