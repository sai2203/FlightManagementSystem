package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.model.Contact;



public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
