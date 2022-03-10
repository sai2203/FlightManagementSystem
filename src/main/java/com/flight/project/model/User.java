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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name="user_details")
public class User {
	
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Size(min=4, message="Minimum 4 characters are required")
	@NotEmpty(message = "user name cannot be null")
	private String userName;
	@NotEmpty(message = "first name cannot be null")
	private String firstName;
	@NotEmpty(message = "last name cannot be null")
	private String lastName;
	
	@Email(message="Provide valid email id")
	private String email;
	

@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinColumn(name="fk_ct_id")
private Contact contact;
	
//	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
//	@JoinColumn(name="fk_user_id",referencedColumnName="user_id")
//	private List<Passenger> passenger;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_user_id",referencedColumnName="user_id")
	private List<Booking> booking;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String firstName, String lastName, String email, Contact contact,
 List<Booking> booking) 
			{
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
//		this.passenger = passenger;
//		this.booking = booking;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

//	public List<Passenger> getPassenger() {
//		return passenger;
//	}
//
//	public void setPassenger(List<Passenger> passenger) {
//		this.passenger = passenger;
//	}
//
	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ",contact=" + contact + "]";
	}

	
	
}
