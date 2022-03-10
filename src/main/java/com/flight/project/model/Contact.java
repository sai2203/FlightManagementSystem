package com.flight.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="contact_details")
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_id")
	private int contactId;
	
	@NotEmpty(message = "type cannot be null")
	private String type;
	@NotEmpty(message = "address  cannot be null")
	private String addressLine;
	
	@Pattern(regexp="(^$|[0-9]{6})")
	private Long zipCode;
	
	@NotEmpty(message = "city name cannot be null")
	private String city;
	@NotEmpty(message = "state name cannot be null")
	private String state;
	@NotEmpty(message = "country name cannot be null")
	private String country;
	@Pattern(regexp="(^$|[0-9]{10})")
	private Long mobileNo;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int contactId, String type, String addressLine, Long zipCode, String city, String state,
			String country, Long mobileNo) {
		super();
		this.contactId = contactId;
		this.type = type;
		this.addressLine = addressLine;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobileNo = mobileNo;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public Long getZipCode() {
		return zipCode;
	}
	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", type=" + type + ", addressLine=" + addressLine + ", zipCode="
				+ zipCode + ", city=" + city + ", state=" + state + ", country=" + country + ", mobileNo=" + mobileNo
				+ "]";
	}
	
	

}
