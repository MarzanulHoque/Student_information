package com.example.Company_data.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Company {
	@Id
	public ObjectId _id;
	
	public String name;
	public String address;
	public String phone_number;
	
	
	public  Company() {}
	
	public Company( ObjectId _id, String name,String address, String phone_number)
	{
		this._id = _id;
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		
	}

	public String get_id() { return _id.toHexString(); }
	public void set_id(ObjectId _id) { this._id = _id; }
	
	public String getAddress() {return name;}
	public void setAddress(String name) {this.name = name;}

	public String getName() {return address;}
	public void setName(String address) {	this.address = address;}

	public String getPhone_number() {return phone_number;}
	public void setPhone_number(String phone_number) {this.phone_number = phone_number;}


}
