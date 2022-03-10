package com.flight.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.dao.FleetRepository;
import com.flight.project.model.Fleet;
import com.flight.project.service.FleetService;


@Service
public class FleetServiceImpl implements FleetService{

	
	@Autowired
	FleetRepository fleetRepository;
	@Override
	public void addFleet(Fleet fleet) {
		// TODO Auto-generated method stub
		fleetRepository.save(fleet);
	}

	@Override
	public void delFleet(Integer fleet_id) {
		// TODO Auto-generated method stub
		fleetRepository.deleteById(fleet_id);
		
	}

	@Override
	public void updateFleet(Fleet fleet, Integer fleet_id) {
		// TODO Auto-generated method stub
		fleet.setFleetId(fleet_id);
		fleetRepository.save(fleet);
		
	}
	

	

}
