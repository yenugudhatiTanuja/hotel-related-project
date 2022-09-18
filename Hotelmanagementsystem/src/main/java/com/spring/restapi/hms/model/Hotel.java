package com.spring.restapi.hms.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Hotel")
public class Hotel {
	@Id
	@Column(name = "hotelId")
	private @NotNull int hotelId;
	@Column(name = "hotel_name")
	private @NotNull String hotelName;
	@Column(name = "hotel_city")
	private @NotNull String hotelCity;
	@Column(name = "room_type")
	private @NotNull String roomType;
	@Column(name = "room_price_per_day")
	private @NotNull int roomPricePerDay;


	@ManyToOne
	@JoinColumn(name = "adminId")
	private Admin adm;

	public Admin getAdm() {
		return adm;
	}

	public void setAdm(Admin adm) {
		this.adm = adm;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRoomPricePerDay() {
		return roomPricePerDay;
	}

	public void setRoomPricePerDay(int roomPricePerDay) {
		this.roomPricePerDay = roomPricePerDay;
	}


	public Hotel(int hotelId, String hotelName, String hotelCity, String roomType, int roomPricePerDay) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.roomType = roomType;
		this.roomPricePerDay = roomPricePerDay;

	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

}