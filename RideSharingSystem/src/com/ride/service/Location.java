package com.ride.service;

public class Location {
	double latitude;
	double longitude;

	public Location(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double distanceTo(Location other) {
		// Use Haversine formula to calculate distance between two locations
		double R = 6371; // Radius of the Earth in km
		double dLat = Math.toRadians(other.latitude - this.latitude);
		double dLon = Math.toRadians(other.longitude - this.longitude);
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(this.latitude))
				* Math.cos(Math.toRadians(other.latitude)) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		return R * c; // Distance in km
	}
}
