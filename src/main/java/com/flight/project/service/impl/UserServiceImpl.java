package com.flight.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flight.project.dao.UserRepository;
import com.flight.project.exceptions.UserNotFoundException;
import com.flight.project.model.User;
import com.flight.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
		userRepository.deleteById(id);
		
	}

	@Override
	public ResponseEntity<User> updateUserById(Integer userId, User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		User newUser = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User ID :: " + userId + " Not Found"));
		// update data here
		newUser.setUserName(user.getUserName());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setEmail(user.getEmail());
		newUser.setContact(user.getContact());
		
		
		final User updatedUser = userRepository.save(newUser);
		return ResponseEntity.ok().body(updatedUser);
	}
	
	
	
//	public ResponseEntity<User> updateUserById(Long userId, User user) throws UserNotFoundException {
//		User newUser = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User ID :: " + userId + " Not Found"));
//		// update data here
//		newUser.setUserName(user.getUserName());
//		newUser.setUserEmail(user.getUserEmail());
//		newUser.setUserUsername(user.getUserUsername());
//		newUser.setUserPassword(user.getUserPassword());
//		newUser.setUserAddress(user.getUserAddress());

	

}
