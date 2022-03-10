package com.flight.project.service;

import com.flight.project.model.Location;

public interface LocationService {
	
	public Location addLocation(Location location);
	public void delLocation(Integer location_id);
	public void updateLocation(Location location, Integer location_id);
	


}
