package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.model.User;


public interface UserRepository extends JpaRepository<User,Integer>{

}
