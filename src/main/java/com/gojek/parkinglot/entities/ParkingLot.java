package com.gojek.parkinglot.entities;

import java.util.List;
/**
 * 
 * @author Prachi
 * Parking Lot Pojo
 *
 */

public class ParkingLot {
	
	private static ParkingLot parkingLot;

	private List<Car> parkingCars;
	
	private int totalParkingSlots;

	public static ParkingLot getParkingLot() {
		return parkingLot;
	}

	public List<Car> getParkingCars() {
		return parkingCars;
	}

	public int getTotalParkingSlots() {
		return totalParkingSlots;
	}

	@Override
	public String toString() {
		return "ParkingLot [parkingCars=" + parkingCars + ", totalParkingSlots=" + totalParkingSlots + "]";
	}
}