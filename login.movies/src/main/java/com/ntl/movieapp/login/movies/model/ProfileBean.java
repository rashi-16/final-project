/**
 * 
 * 
 * 
 * 
 */

package com.ntl.movieapp.login.movies.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_Profile")
public class ProfileBean {
	
	
	
	@Id
	@Column(name="USERID")
	private String userId;
	@Column(name="FIRSTNAME")
	private String firstName;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="DATEOFBIRTH")
	private LocalDate dateOfBirth;
	@Column(name="GENDER")
	private String gender;
	@Column(name="STREET")
	private String street;
	@Column(name="LOCATION")
	private String location;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="PINCODE")
	private String pincode;
	@Column(name="MOBILENO")
	private String mobileNo;
	@Column(name="EMAILID")
	private String emailID;
	@Column(name="PASSWORD")
	private String password;
	
	
	
	
	
	
	/**
	 * 
	 */
	public ProfileBean() {
		super();
		
	}
	
	
	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param gender
	 * @param street
	 * @param location
	 * @param city
	 * @param state
	 * @param pincode
	 * @param mobileNo
	 * @param emailID
	 * @param password
	 */
	public ProfileBean(String userId, String firstName, String lastName,  String mobileNo, String emailID, String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.emailID = emailID;
		this.password = password;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
