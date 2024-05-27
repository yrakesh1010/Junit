package com.rk.dao;

import java.util.List;

import com.rk.pojo.ContactPojo;

public interface ContactDao {
    
	public String findNameById(Integer id);
	public List<String> findNames();
	public ContactPojo findByIdPojo(Integer id);
}
