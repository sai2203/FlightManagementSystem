package com.flight.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
@Table(name="flightStatus_details")
public class FlightStatus {
	
	

	
	
	
	
	
	@Id
	@Column(name="flightStatus_id")
	private int flightStatusId;
	private int remainingEconomySeats;
	private int remainingPremiumSeats;
	private int remainingBusinessSeats;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_flst_id")
	Fleet fleet = new Fleet();
	public FlightStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightStatus(int flightStatusId, int remainingEconomySeats, int remainingPremiumSeats,
			int remainingBusinessSeats) {
		super();
		this.flightStatusId = flightStatusId;
		this.remainingEconomySeats = remainingEconomySeats;
		this.remainingPremiumSeats = remainingPremiumSeats;
		this.remainingBusinessSeats = remainingBusinessSeats;
	}
	public int getFlightStatusId() {
		return flightStatusId;
	}
	public void setFlightStatusId(int flightStatusId) {
		this.flightStatusId = flightStatusId;
	}
	public int getRemainingEconomySeats() {
		return this.remainingEconomySeats;
	}
	public void setRemainingEconomySeats(int remainingEconomySeats) {
		this.remainingEconomySeats = remainingEconomySeats;
	}
	public int getRemainingPremiumSeats() {
		return this.remainingPremiumSeats;
	}
	public void setRemainingPremiumSeats(int remainingPremiumSeats) {
		this.remainingPremiumSeats = remainingPremiumSeats;
	}
	public int getRemainingBusinessSeats() {
		return this.remainingBusinessSeats;
	}
	public void setRemainingBusinessSeats(int remainingBusinessSeats) {
		this.remainingBusinessSeats = remainingBusinessSeats;
	}
	@Override
	public String toString() {
		return "FlightStatus [flightStatusId=" + flightStatusId + ", remainingEconomySeats=" + remainingEconomySeats
				+ ", remainingPremiumSeats=" + remainingPremiumSeats + ", remainingBusinessSeats="
				+ remainingBusinessSeats + "]";
	}
	
	

}
