package com.flight.project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.flight.project.exceptions.UserNotFoundException;
import com.flight.project.model.User;

public interface UserService {
	
	public User saveUser(User user);
	public List<User> getAllUser();
	public void deleteUser(Integer id);
	public ResponseEntity<User> updateUserById(Integer userId, User user) throws UserNotFoundException;
	
	
	
	
	
	

}
