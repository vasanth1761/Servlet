package com.railway.model;

public class userP {
  String name;
  String email;
  String phonenumber;
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phone) {
	this.phonenumber = phone;
}

public String getEmail() {
	return email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	this.email = email;
}


public userP(String name, String email, String phonenumber) {
	super();
	this.name = name;
	this.email = email;
	this.phonenumber = phonenumber;
}
public userP() {
	// TODO Auto-generated constructor stub
}
}
