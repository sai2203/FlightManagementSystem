package com.flight.project.service;

import com.flight.project.model.Contact;

public interface ContactService {
	
	public Contact addContact(Contact contact);
	public void delContact(Integer contact_id);
	public void  updateContact(Contact contact , Integer contact_id);

}
