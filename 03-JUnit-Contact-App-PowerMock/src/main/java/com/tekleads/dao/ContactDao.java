package com.tekleads.dao;

import java.util.List;

import com.tekleads.model.Contact;

public interface ContactDao {

	public Long findContactNumByName(String name);

	public List<Contact> findAll();
	
	public List<Contact> findInActiveRecords();
	
	public boolean saveContact(Contact c);
}
