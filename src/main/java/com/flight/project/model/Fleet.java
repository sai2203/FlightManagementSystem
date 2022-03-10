package com.flight.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fleet_details")
public class Fleet {
	
	
	@Id

	@Column(name="fleet_id")
	private int fleetId;
	private String code;
	private String model;
	private int totalEconomySeats;
	private int totalPremiumSeats;
	private int totalBusinessSeats;
	public Fleet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fleet(int fleetId, String code, String model, int totalEconomySeats, int totalPremiumSeats,
			int totalBusinessSeats) {
		super();
		this.fleetId = fleetId;
		this.code = code;
		this.model = model;
		this.totalEconomySeats = totalEconomySeats;
		this.totalPremiumSeats = totalPremiumSeats;
		this.totalBusinessSeats = totalBusinessSeats;
	}
	public int getFleetId() {
		return fleetId;
	}
	public void setFleetId(int fleetId) {
		this.fleetId = fleetId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getTotalEconomySeats() {
		return totalEconomySeats;
	}
	public void setTotalEconomySeats(int totalEconomySeats) {
		this.totalEconomySeats = totalEconomySeats;
	}
	public int getTotalPremiumSeats() {
		return totalPremiumSeats;
	}
	public void setTotalPremiumSeats(int totalPremiumSeats) {
		this.totalPremiumSeats = totalPremiumSeats;
	}
	public int getTotalBusinessSeats() {
		return totalBusinessSeats;
	}
	public void setTotalBusinessSeats(int totalBusinessSeats) {
		this.totalBusinessSeats = totalBusinessSeats;
	}
	@Override
	public String toString() {
		return "Fleet [fleetId=" + fleetId + ", code=" + code + ", model=" + model + ", totalEconomySeats="
				+ totalEconomySeats + ", totalPremiumSeats=" + totalPremiumSeats + ", totalBusinessSeats="
				+ totalBusinessSeats + "]";
	}
	
	

}
