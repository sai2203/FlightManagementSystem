package com.flight.project.service;


import java.util.List;

import com.flight.project.exceptions.InsufficientBalanceException;
import com.flight.project.exceptions.SeatsNotAvailableException;
import com.flight.project.model.Booking;
import com.flight.project.model.Passenger;

public interface BookingService {

	
	

 
public String cancelBooking(Integer bookingId);



public String makeBooking(Booking booking, String seat, Integer id,Integer noOfSeats, String accountNumber) throws SeatsNotAvailableException, InsufficientBalanceException;

public List<Booking> viewAllBookings();

//public void addPassenger(Integer booking_id,Passenger passenger);

}
