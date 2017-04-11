package com.gojek.parkinglot.entities;

public class Car {
	
	private String carRegistrationNumber;
	private String carColor;
	
	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}
	public String getCarColor() {
		return carColor;
	}
	@Override
	public String toString() {
		return "Car [carRegistrationNumber=" + carRegistrationNumber + ", carColor=" + carColor + "]";
	}
}