package com.ride.service;

import java.util.TreeMap;

import com.ride.dao.Driver;

public class RidematchService {

	static RidematchService ridematchService;
	private TreeMap<Double, Driver> availableDrivers = new TreeMap<>();// Because of sorting

	private RidematchService() {
	}

	public static synchronized RidematchService getInstance() {// Single Ton
		if (ridematchService == null) {
			ridematchService = new RidematchService();
		}
		return ridematchService;
	}

	// Add driver with distance from user
	public void addDriver(Driver driver, Location userLocation) {
		double distance = userLocation.distanceTo(driver.getLocation());
		availableDrivers.put(distance, driver);
	}

	// Get the nearest available driver
	public Driver findNearestDriver() {
		if (availableDrivers.isEmpty())
			return null;
		return availableDrivers.firstEntry().getValue();
	}

	// Remove driver after they accept a ride
	public void removeDriver(Driver driver, Location userLocation) {
		double distance = userLocation.distanceTo(driver.getLocation());
		availableDrivers.remove(distance);
	}

}
