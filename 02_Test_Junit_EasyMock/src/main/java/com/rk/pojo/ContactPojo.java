package com.rk.pojo;

public class ContactPojo {

	private Integer id;
	private String name;
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ContactPojo [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
