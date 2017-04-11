package com.gojek.parkinglot.entities;

/**
 * 
 * @author Prachi
 * ParkingTicket Pojo
 *
 */
public class Ticket {
	
	private int parkingSlotNumber;
	
	private Car parkingCar;

	public int getParkingSlotNumber() {
		return parkingSlotNumber;
	}
	
	public Car getParkingCar() {
		return parkingCar;
	}

	@Override
	public String toString() {
		return "Ticket [parkingSlotNumber=" + parkingSlotNumber + ", parkingCar=" + parkingCar + "]";
	}
}