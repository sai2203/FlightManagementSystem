package com.flight.project.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="flight_details")
public class Flight {
	
	
	
	
	@Id

	@Column(name="flight_id")
	private int flightId;
	private String departureLocation;
	private String arrivalLocation;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_fl_id")
	private Fleet fleet;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_st_id")
	private FlightStatus status;
	private Date departureTime;
	private Date arrivalTime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_fare_id")
	private Fare fare;

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(int flightId, String departureLocation, String arrivalLocation, Fleet fleet, FlightStatus status,
			Date departureTime, Date arrivalTime, Fare fare) {
		super();
		this.flightId = flightId;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.fleet = fleet;
		this.status = status;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public Fleet getFleet() {
		return fleet;
	}

	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}

	public FlightStatus getStatus() {
		return status;
	}

	public void setStatus(FlightStatus status) {
		this.status = status;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Fare getFare() {
		return fare;
	}

	public void setFare(Fare fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", departureLocation=" + departureLocation + ", arrivalLocation="
				+ arrivalLocation + ", fleet=" + fleet + ", status=" + status + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", fare=" + fare + "]";
	}
	
	

}
