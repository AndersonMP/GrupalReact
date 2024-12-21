package com.krakedev.buses.entidades;

public class Reserva {
	private int reservaID;
	private int usuID;
	private int busID;
	private int rutaID;

	public Reserva() {
		super();
	}

	public Reserva(int usuID, int busID, int rutaID) {
		super();
		this.usuID = usuID;
		this.busID = busID;
		this.rutaID = rutaID;
	}

	public Reserva(int reservaID, int usuID, int busID, int rutaID) {
		super();
		this.reservaID = reservaID;
		this.usuID = usuID;
		this.busID = busID;
		this.rutaID = rutaID;
	}

	public int getReservaID() {
		return reservaID;
	}

	public void setReservaID(int reservaID) {
		this.reservaID = reservaID;
	}

	public int getUsuID() {
		return usuID;
	}

	public void setUsuID(int usuID) {
		this.usuID = usuID;
	}

	public int getBusID() {
		return busID;
	}

	public void setBusID(int busID) {
		this.busID = busID;
	}

	public int getRutaID() {
		return rutaID;
	}

	public void setRutaID(int rutaID) {
		this.rutaID = rutaID;
	}

	@Override
	public String toString() {
		return "Reserva [reservaID=" + reservaID + ", usuID=" + usuID + ", busID=" + busID + ", rutaID=" + rutaID + "]";
	}

}
