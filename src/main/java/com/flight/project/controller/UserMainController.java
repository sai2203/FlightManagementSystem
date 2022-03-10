package com.flight.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.flight.project.exceptions.InsufficientBalanceException;
import com.flight.project.exceptions.SeatsNotAvailableException;
import com.flight.project.exceptions.UserNotFoundException;
import com.flight.project.model.Account;
import com.flight.project.model.Booking;
import com.flight.project.model.Contact;
import com.flight.project.model.Flight;
import com.flight.project.model.User;
import com.flight.project.service.AccountService;
import com.flight.project.service.BookingService;
import com.flight.project.service.ContactService;
import com.flight.project.service.FlightService;
import com.flight.project.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserMainController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.OK);
	}
	
	@GetMapping("/viewUser")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@DeleteMapping("/delUser/{id}")
	public ResponseEntity<String> delUser(@PathVariable("id") Integer id){
		userService.deleteUser(id);
		return new ResponseEntity<String>("User deleted sucessfully",HttpStatus.OK);
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUserById(@PathVariable(value = "id") Integer userId, @RequestBody User user) throws UserNotFoundException{
		return userService.updateUserById(userId, user);
	}
	
//Booking Controller
	
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/booking/{seat}/{flightId}/{noSeats}/{accountNumber}")
	public 	String doBooking(@RequestBody Booking booking,@PathVariable("seat") String seat,@PathVariable("flightId") Integer flightId,
			@PathVariable("noSeats") Integer noOfSeats, @PathVariable String accountNumber) throws SeatsNotAvailableException, InsufficientBalanceException {
		return bookingService.makeBooking(booking,seat,flightId,noOfSeats,accountNumber);
		
	}
	
	@DeleteMapping("/cancelBooking/{id}")
	public String cancelBooking(@PathVariable("id") Integer bookingId) {
		return bookingService.cancelBooking(bookingId);
	}
	
	@GetMapping("/viewAllBookings")
	public List<Booking> viewAllBookings(){
		return bookingService.viewAllBookings();
	}
	
	//Account Controller
	
	@Autowired
	AccountService accountservice;
	
	@PostMapping("/addAccount")
	public void addAccount(@RequestBody Account account) {
		accountservice.addAccount(account);
	}
	
	@PutMapping("/updateAccount/{accountNumber}/{balance}")
	public void updateAccount(@PathVariable String accountNumber, @RequestBody Account account) {
		accountservice.updateAccount(accountNumber,account);
		
	}
	
	//Flight User Controller
	
	@Autowired
	FlightService flightService;
	
	@GetMapping("/viewAllFlights")
	public List<Flight> getAllFlights(){
		return flightService.viewAllFlights();
	}
	
	@GetMapping("/searchFlight/{id}")
	public ResponseEntity<Flight> getFlight(@PathVariable("id") Integer flightId) throws FlightNotFoundException{
		return flightService.searchFlight(flightId);
	}

	
	//Contact Controller
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact contact) {
		return contactService.addContact(contact);
	}
	
	@DeleteMapping("/delContact/{contact_id}/")
	public void delContact(@PathVariable Integer contact_id) {
		contactService.delContact(contact_id);
	}
	
	@PutMapping("/updateContact/{contact_id}")
	public void updateContact(@RequestBody Contact contact, @PathVariable Integer contact_id) {
		contactService.updateContact(contact, contact_id);
	}

}


