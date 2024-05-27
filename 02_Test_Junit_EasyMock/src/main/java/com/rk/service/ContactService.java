package com.rk.service;

import java.util.List;

import com.rk.pojo.ContactPojo;

public interface ContactService {
     public String getNameById(Integer id);
     public List<String> getAllNames();
     public ContactPojo getNameByPojoId(Integer id);
}
