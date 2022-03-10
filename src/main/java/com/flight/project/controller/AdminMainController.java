package com.flight.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.project.exceptions.FlightNotFoundException;
import com.flight.project.model.Fare;
import com.flight.project.model.Fleet;
import com.flight.project.model.Flight;
import com.flight.project.model.Location;
import com.flight.project.service.FareService;
import com.flight.project.service.FleetService;
import com.flight.project.service.FlightService;
import com.flight.project.service.LocationService;

@RestController
@RequestMapping("/api/Admin")
public class AdminMainController {


	@Autowired
	FlightService flightService;

	@PostMapping("/addFlight")
	public Flight addFlight(@RequestBody Flight flight) {
		return flightService.addFlight(flight);
	}

	@DeleteMapping("/deleteFlight/{id}")
	public void removeFlight(@PathVariable("id") Integer flightId) {
		flightService.delFlight(flightId);

	}

	@PutMapping("/modifyFlight/{id}")
	public void updateFlight(@RequestBody Flight flight, @PathVariable("id") Integer flightId) {
		flightService.updateFlight(flight, flightId);
	}

	@GetMapping("/viewAllFlights")
	public List<Flight> getAllFlights() {
		return flightService.viewAllFlights();
	}

	@GetMapping("/searchFlight/{id}")
	public ResponseEntity<Flight> getFlight(@PathVariable("id") Integer flightId) throws FlightNotFoundException {
		return flightService.searchFlight(flightId);
	}

	// FleetController

	@Autowired
	FleetService fleetService;

	@PostMapping("/addFleet")
	public void addFleet(@RequestBody Fleet fleet) {
		fleetService.addFleet(fleet);
	}

	@DeleteMapping("/deleteFleet/{id}")
	public void removeFleet(@PathVariable("id") Integer fleetId) {
		fleetService.delFleet(fleetId);

	}

	@PutMapping("/modifyFleet/{id}")
	public void updateFleet(@RequestBody Fleet fleet, @PathVariable("id") Integer fleetId) {
		fleetService.updateFleet(fleet, fleetId);
	}

	// Fare Controller

	@Autowired
	private FareService fareService;

	@PutMapping("/updateFare")
	public void updateFare(@RequestBody Fare fare, @PathVariable Integer fare_id) {
		fareService.updateFare(fare, fare_id);
	}

	// Location Controller
	@Autowired
	LocationService locationService;

	@PostMapping("/addLocation")
	public Location addLocation(@RequestBody Location location) {
		return locationService.addLocation(location);
	}

	@DeleteMapping("/deleteLocation/{id}")
	public void removeLocation(@PathVariable("id") Integer locationId) {
		locationService.delLocation(locationId);

	}

	@PutMapping("/modifyLocation/{id}")
	public void updateFlight(@RequestBody Location location, @PathVariable("id") Integer locationId) {
		locationService.updateLocation(location, locationId);
	}
}
