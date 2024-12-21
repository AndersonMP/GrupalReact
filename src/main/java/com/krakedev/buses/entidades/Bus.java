package com.krakedev.buses.entidades;

public class Bus {
	private int busID;
	private int busCapMax;

	public Bus() {

	}

	public Bus(int busID) {
		this.busID = busID;
	}

	public Bus(int busID, int busCapMax) {
		super();
		this.busID = busID;
		this.busCapMax = busCapMax;
	}

	public int getBusID() {
		return busID;
	}

	public void setBusID(int busID) {
		this.busID = busID;
	}

	public int getBusCapMax() {
		return busCapMax;
	}

	public void setBusCapMax(int busCapMax) {
		this.busCapMax = busCapMax;
	}

	@Override
	public String toString() {
		return "Bus [busID=" + busID + ", busCapMax=" + busCapMax + "]";
	}

}
