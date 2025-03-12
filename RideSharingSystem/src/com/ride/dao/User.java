package com.ride.dao;

import com.ride.service.Location;

public class User {
	private Integer id;
	private String name;
	private long number;
	private String pickUp;
	private String drop;
	private Location location;

	public User(Integer id, String name, long number, String pickUp, String drop, Location location) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.pickUp = pickUp;
		this.drop = drop;
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

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getPickUp() {
		return pickUp;
	}

	public void setPickUp(String pickUp) {
		this.pickUp = pickUp;
	}

	public String getDrop() {
		return drop;
	}

	public void setDrop(String drop) {
		this.drop = drop;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
