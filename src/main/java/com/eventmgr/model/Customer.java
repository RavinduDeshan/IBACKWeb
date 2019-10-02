package com.eventmgr.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Customer")
public class Customer {
	

	@Id
	private String cId;
	private String email;
	private String nic;
	private String fName;
	private String lName;
	private String address;
	private String phneNo;
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String password;
	
	
	
	public Customer(String email, String nic, String fName, String lName, String address, String  phneNo,String password) {
		super();
		this.email = email;
		this.nic = nic;
		this.fName = fName;
		this.address = address;
		this.phneNo = phneNo;
		this.phneNo = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String setcId(String cId) {
		return this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String  getPhneNo() {
		return phneNo;
	}
	public void setPhneNo(String  phneNo) {
		this.phneNo = phneNo;
	}
	public String getcId() {
		
		return cId;
	}
	

	

}
