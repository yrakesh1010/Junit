package com.ashokit.service;

import com.ashokit.dao.UserDao;

public class UserService {

	private UserDao dao;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	public UserService(UserDao dao) {
		this.dao = dao;
	}

	public String getNameByUserId(Integer id) {
		String name = dao.findNameById(id);
		return name;
	}

	public String getEmailByUserId(Integer id) {
		String email = dao.findEmailById(id);
		return email;
	}
	
	public void doProcess() {
		System.out.println("doProcess() method started");
		pushMsgToKafkaTopic("msg");
		System.out.println("doProcess() method ended");
	}
	
	public void pushMsgToKafkaTopic(String msg) {
		System.out.println("msg pushing to kafka......");
	}
	
	public String m1() {
		String formattedMsg = formatMsg("test msg");
		return formattedMsg;
	}
	
	private String formatMsg(String msg) {
		System.out.println("formatMsg() called");
		return msg.toUpperCase();
	}

}
