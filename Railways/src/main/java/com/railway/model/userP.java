package com.railway.model;

import java.util.ArrayList;

public class userP {
  int id;
  public userP(int id, String name, String email, String phonenumber) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phonenumber = phonenumber;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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


public userP(String name, String email, String phonenumber,int id) {
	super();
	this.id=id;
	this.name = name;
	this.email = email;
	this.phonenumber = phonenumber;
}
public userP() {
	// TODO Auto-generated constructor stub
}

}
