package com.flight.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="passenger_details")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="flightStatus_id")
	private int passengerId;
	private String firstName;
	private String lastName;
	private int age;
	@NotEmpty(message = "Gender")
	private char gender;
	@NotEmpty(message = "Passport number cannot be null")
	private String passportNo;
	private String mealPref;
//	
//	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//	@JoinTable(name="user_details",
//	joinColumns= {@JoinColumn(name="passenger_id")},
//	inverseJoinColumns= {@JoinColumn(name="booking_id")})
//	private List<Booking> booking;
	public Passenger(int passengerId, String firstName, String lastName, int age,
			@NotEmpty(message = "Gender") char gender,
			@NotEmpty(message = "Passport number cannot be null") String passportNo, String mealPref) {
		super();
		this.passengerId = passengerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.passportNo = passportNo;
		this.mealPref = mealPref;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getMealPref() {
		return mealPref;
	}
	public void setMealPref(String mealPref) {
		this.mealPref = mealPref;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", gender=" + gender + ", passportNo=" + passportNo + ", mealPref=" + mealPref + "]";
	}
	
	
	
	
	
	

}
