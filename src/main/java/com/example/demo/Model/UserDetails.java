package com.example.demo.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserDetails {
	@Id
	private int userid;
	private String name;
	private String email;
	private long phoneno;
	private String address;
	private String itemreq;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getItemreq() {
		return itemreq;
	}
	public void setItemreq(String itemreq) {
		this.itemreq = itemreq;
	}
	public UserDetails(int userid, String name, String email, long phoneno, String address, String itemreq) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.address = address;
		this.itemreq = itemreq;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}