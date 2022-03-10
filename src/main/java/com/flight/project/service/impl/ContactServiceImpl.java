package com.flight.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.dao.ContactRepository;
import com.flight.project.model.Contact;
import com.flight.project.service.ContactService;


@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Contact addContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.save(contact);
	}

	@Override
	public void delContact(Integer contact_id) {
		// TODO Auto-generated method stub
		contactRepository.deleteById(contact_id);
		
	}

	@Override
	public void updateContact(Contact contact, Integer contact_id) {
		// TODO Auto-generated method stub
		
		contact.setContactId(contact_id);
		contactRepository.save(contact);
		
	}

}
