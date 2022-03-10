package com.flight.project.service;

import com.flight.project.model.Fleet;

public interface FleetService {
	
	public void addFleet(Fleet fleet);
	
	public void delFleet(Integer fleet_id);
	
	public void updateFleet(Fleet fleet, Integer fleet_id);

}
