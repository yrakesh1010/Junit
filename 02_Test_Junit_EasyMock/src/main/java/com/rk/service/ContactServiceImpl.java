package com.rk.service;

import java.util.List;

import com.rk.dao.ContactDao;
import com.rk.exception.IdNotFoundException;
import com.rk.pojo.ContactPojo;

public class ContactServiceImpl implements ContactService {
	
	private ContactDao dao;
	
	public void setConDao(ContactDao dao) {
		this.dao=dao;
	}

	@Override
	public String getNameById(Integer id) {
		String name=dao.findNameById(id);
		String upperCase = name.toUpperCase();
		return upperCase;
	}

	@Override
	public List<String> getAllNames() {
		List<String> names = dao.findNames();
		if(!names.isEmpty()) {
			return names;
		}
		return null;
	}

	@Override
	public ContactPojo getNameByPojoId(Integer id) {
		
		  ContactPojo cont = dao.findByIdPojo(id);
		    if (cont == null ) {
		    	throw new IdNotFoundException("ID not found");
		    } 
		    return cont;
		    
		
	}
}	
	


