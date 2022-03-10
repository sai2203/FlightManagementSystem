package com.flight.project.model;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking_details")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="booking_id")
	private int bookingId;
	
	@Column(name="booking_number")
	private Long bookingNumber;
	private Date bookingDate;
	private Date travelDate;
//	private double totalCost;
	
//	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="booking")
//	private List<Passenger> passenger;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_pasngr_id",referencedColumnName="booking_id")
	private List<Passenger> passenger;
	

	

	public Booking(int bookingId, Long bookingNumber, Date bookingDate, Date travelDate, List<Passenger> passenger) {
	super();
	this.bookingId = bookingId;
	this.bookingNumber = bookingNumber;
	this.bookingDate = bookingDate;
	this.travelDate = travelDate;
	this.passenger = passenger;
}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Booking(int bookingId, Long bookingNumber, Date bookingDate, Date travelDate) {
//		super();
//		this.bookingId = bookingId;
//		this.bookingNumber = bookingNumber;
//		this.bookingDate = bookingDate;
//		this.travelDate = travelDate;
////		this.totalCost = totalCost;
//		
//	}

	public List<Passenger> getPassenger() {
		return passenger;
	}


	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}


	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Long getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(Long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

//	public double getTotalCost() {
//		return totalCost;
//	}

//	public void setTotalCost(double totalCost) {
//		this.totalCost = totalCost;
//	}

	

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingNumber=" + bookingNumber + ", bookingDate=" + bookingDate
				+ ", travelDate=" + travelDate + ", passenger=" + passenger + "]";
	}
	
	
	
	
	
	

}
