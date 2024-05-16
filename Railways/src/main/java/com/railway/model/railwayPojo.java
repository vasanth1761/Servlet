package com.railway.model;

public class railwayPojo {
	 String Username;
	 String phonenumber;
	 String date;
	 String location;
	 String password;
	
	 String email;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getemail() {
		return email;
	}
	public void setNumber(String email) {
		this.email = email;
	}
	public railwayPojo(String username,String email, String phonenumber, String date, String location, String password) {
		
		this.Username = username;
		this.email=email;
		this.phonenumber = phonenumber;
		this.date = date;
		this.location = location;
		this.password = password;
	}
	 
}

