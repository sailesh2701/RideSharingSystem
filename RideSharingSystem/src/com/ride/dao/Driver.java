package com.ride.dao;

import com.ride.service.Location;

public class Driver {

	private Integer id;
	private String name;
	private long phoneNumber;
	private Integer rating;
	private boolean isAvailable;
	private boolean isOnRide;
	private Location location;

	public Driver(Integer id, String name, long phoneNumber, Integer rating, boolean isAvailable, boolean isOnRide,
			Location location) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.rating = rating;
		this.isAvailable = isAvailable;
		this.isOnRide = isOnRide;
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public boolean isAvailablity() {
		return isAvailable;
	}

	public void setAvailablity(boolean availablity) {
		this.isAvailable = availablity;
	}

	public boolean isOnRide() {
		return isOnRide;
	}

	public void setOnRide(boolean isOnRide) {
		this.isOnRide = isOnRide;
	}

}
