package com.flight.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.dao.FareRepository;
import com.flight.project.model.Fare;
import com.flight.project.service.FareService;


@Service
public class FareServiceImpl implements FareService {
	
	@Autowired
	private FareRepository fareRepository;
	

	@Override
	public void updateFare(Fare fare, Integer fare_id) {
		// TODO Auto-generated method stub
		
		fare.setFareId(fare_id);
		fareRepository.save(fare);
		
	}

}
