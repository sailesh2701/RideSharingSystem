package com.ride.main;

import com.ride.dao.Driver;
import com.ride.service.Location;
import com.ride.service.RidematchService;

public class RideServiceApp {
	public static void main(String[] args) {
		RidematchService rideMatchingService = RidematchService.getInstance();

		Location userLocation = new Location(12.9716, 77.5946); // Example user location

		// Adding drivers
		rideMatchingService.addDriver(
				new Driver(1, "Driver A", 9876543210L, 5, true, false, new Location(12.9611, 77.6010)), userLocation);
		rideMatchingService.addDriver(
				new Driver(2, "Driver B", 9876543211L, 4, true, false, new Location(12.9785, 77.5940)), userLocation);
		rideMatchingService.addDriver(
				new Driver(3, "Driver C", 9876543212L, 3, false, false, new Location(12.9675, 77.5900)), userLocation);

		// Finding the nearest driver
		Driver nearestDriver = rideMatchingService.findNearestDriver();
		if (nearestDriver != null) {
			System.out.println("Nearest Driver: " + nearestDriver.getName());
		} else {
			System.out.println("No available drivers.");
		}
	}
}
