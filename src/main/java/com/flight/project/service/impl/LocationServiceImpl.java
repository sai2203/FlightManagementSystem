package com.flight.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.dao.LocationRepository;
import com.flight.project.model.Location;
import com.flight.project.service.LocationService;


@Service
public class LocationServiceImpl implements LocationService {

	
	@Autowired
	private LocationRepository locationRepository;
	@Override
	public Location addLocation(Location location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	@Override
	public void delLocation(Integer location_id) {
		// TODO Auto-generated method stub
		
		locationRepository.deleteById(location_id);
		
	}

	@Override
	public void updateLocation(Location location, Integer location_id) {
		// TODO Auto-generated method stub
		location.setLocationId(location_id);
		locationRepository.save(location);
		
	}

}
