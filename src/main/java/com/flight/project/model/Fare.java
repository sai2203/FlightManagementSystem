package com.flight.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fare_details")
public class Fare {
	
	@Id
	
	@Column(name="fare_id")
	private int fareId;
	private double economyFare;
	private double premiumFare;
	private double businessFare;
	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fare(int fareId, double economyFare, double premiumFare, double businessFare) {
		super();
		this.fareId = fareId;
		this.economyFare = economyFare;
		this.premiumFare = premiumFare;
		this.businessFare = businessFare;
	}
	public int getFareId() {
		return fareId;
	}
	public void setFareId(int fareId) {
		this.fareId = fareId;
	}
	public double getEconomyFare() {
		return economyFare;
	}
	public void setEconomyFare(double economyFare) {
		this.economyFare = economyFare;
	}
	public double getPremiumFare() {
		return premiumFare;
	}
	public void setPremiumFare(double premiumFare) {
		this.premiumFare = premiumFare;
	}
	public double getBusinessFare() {
		return businessFare;
	}
	public void setBusinessFare(double businessFare) {
		this.businessFare = businessFare;
	}
	@Override
	public String toString() {
		return "Fare [fareId=" + fareId + ", economyFare=" + economyFare + ", premiumFare=" + premiumFare
				+ ", businessFare=" + businessFare + "]";
	}
	
	
	

}
