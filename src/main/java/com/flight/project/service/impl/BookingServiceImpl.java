package com.flight.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.dao.AccountRepository;
import com.flight.project.dao.BookingRepository;
import com.flight.project.dao.FareRepository;
import com.flight.project.dao.FlightRepository;
import com.flight.project.dao.FlightStatusRepository;
import com.flight.project.dao.PassengerRepository;
import com.flight.project.dao.PaymentRepository;
import com.flight.project.dao.UserRepository;
import com.flight.project.exceptions.InsufficientBalanceException;
import com.flight.project.exceptions.SeatsNotAvailableException;
import com.flight.project.model.Account;
import com.flight.project.model.Booking;
import com.flight.project.model.Fare;
import com.flight.project.model.Flight;
import com.flight.project.model.FlightStatus;
import com.flight.project.model.Passenger;
import com.flight.project.model.Payment;
import com.flight.project.service.BookingService;
import com.flight.project.service.PaymentService;



@Service
public class BookingServiceImpl implements BookingService{
	
@Autowired
BookingRepository bookingRepository;

@Autowired 
FlightStatusRepository flightStatusRepository;

@Autowired
FlightRepository flightRepository;

@Autowired
PassengerRepository passengerRepository;

@Autowired
UserRepository userrepo;

@Autowired
AccountRepository accountrepo;

@Autowired
PaymentService paymentservice;

@Autowired
PaymentRepository paymentrepo;


@Autowired
FareRepository fareRepo;

	@Override
	public String makeBooking(Booking booking,String seat,Integer id,Integer noOfSeats, String accountNumber) throws SeatsNotAvailableException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		double totalCost=0;
//		double totalCost1="";
		if(seat.equals("economySeats")) {
			FlightStatus flightstatus = flightStatusRepository.getById(id);
			if(flightstatus.getRemainingEconomySeats()==0) {
				throw new SeatsNotAvailableException("Economy seats are not avialable");
			}
			else {
				flightstatus.setRemainingEconomySeats(flightstatus.getRemainingEconomySeats()-noOfSeats);
				flightStatusRepository.save(flightstatus);
				Fare fare=fareRepo.getById(id);
				totalCost=fare.getEconomyFare()*noOfSeats*(0.05*fare.getEconomyFare());
				
			}
		}
		else if(seat.equals("premiumSeats")) {
			
			FlightStatus flightstatus = flightStatusRepository.getById(id);
			if(flightstatus.getRemainingPremiumSeats()==0) {
				throw new SeatsNotAvailableException("Premium seats are not avialable");
			}
			else {
				flightstatus.setRemainingPremiumSeats(flightstatus.getRemainingPremiumSeats()-noOfSeats);
				flightStatusRepository.save(flightstatus);
				Fare fare=fareRepo.getById(id);
				totalCost=fare.getPremiumFare()*noOfSeats*(0.05*fare.getPremiumFare());
				
				
			}
		}
		else if(seat.equals("businessSeats")) {
			FlightStatus flightstatus = flightStatusRepository.getById(id);
			if(flightstatus.getRemainingBusinessSeats()==0) {
				throw new SeatsNotAvailableException("Business seats are not avialable");
			}
			else {
				flightstatus.setRemainingBusinessSeats(flightstatus.getRemainingBusinessSeats()-noOfSeats);
				flightStatusRepository.save(flightstatus);
				Fare fare=fareRepo.getById(id);
				totalCost=fare.getBusinessFare()*noOfSeats*(0.05*fare.getBusinessFare());
			}
	}	
		paymentservice.doPayment(accountNumber, totalCost);
	    paymentservice.addPaymentdetails(booking.getBookingId(), totalCost);
		bookingRepository.save(booking);
		return "Total Cost is: "+totalCost;
	}
	
		@Override
	public String cancelBooking(Integer bookingId) {
		// TODO Auto-generated method stub
		
		bookingRepository.deleteById(bookingId);
		return "Successfully deleted";
	}

		@Override
		public List<Booking> viewAllBookings() {
			return bookingRepository.findAll();
		}

//		@Override
//		public void addPassenger(Integer booking_id, Passenger passenger) {
//			Booking booking = bookingRepository.getById(booking_id);
//			bo
//			
//		}
}
