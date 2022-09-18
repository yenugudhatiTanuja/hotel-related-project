package com.spring.restapi.hms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@Column(name = "booking_id")
	private @NotNull int bookingId;
	@Column(name = "hotel_name")
	private @NotNull String hotelName;
	@Column(name = "rooms")
	private @NotNull int rooms;
	@Column(name = "email")
	private @NotNull String email;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="customer_id")
     private Customer ctr;

	
	public Customer getCtr() {
		return ctr;
	}

	public void setCtr(Customer ctr) {
		this.ctr = ctr;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	
	public String getEmail() {
		return email;
	}

	

	public void setEmail(String email) {
		this.email = email;
	}

	public Booking(int bookingId, String hotelName, int rooms,  String email) {
		super();
		this.bookingId = bookingId;
		this.hotelName = hotelName;
		this.rooms = rooms;
		this.email = email;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

}
