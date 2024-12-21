package com.krakedev.buses.entidades;

import java.sql.Timestamp;

public class Ruta {
	private int ruta_id;
	private String rutaOrigen;
	private String rutaDestino;
	private Timestamp rutaHorario;
	private String fechaFormateada;

	public Ruta() {

	}

	public Ruta(int ruta_id) {
		this.ruta_id = ruta_id;
	}

	public Ruta(String fechaFormateada) {
		this.fechaFormateada = fechaFormateada;
	}

	public Ruta(int ruta_id, String rutaOrigen, String rutaDestino, Timestamp rutaHorario) {
		super();
		this.ruta_id = ruta_id;
		this.rutaOrigen = rutaOrigen;
		this.rutaDestino = rutaDestino;
		this.rutaHorario = rutaHorario;
	}

	public Ruta(int ruta_id, String rutaOrigen, String rutaDestino, String fechaFormateada) {
		super();
		this.ruta_id = ruta_id;
		this.rutaOrigen = rutaOrigen;
		this.rutaDestino = rutaDestino;
		this.fechaFormateada = fechaFormateada;
	}
	
	

	public Ruta(String rutaOrigen, String rutaDestino, Timestamp rutaHorario) {
		super();
		this.rutaOrigen = rutaOrigen;
		this.rutaDestino = rutaDestino;
		this.rutaHorario = rutaHorario;
	}

	public int getRuta_id() {
		return ruta_id;
	}

	public void setRuta_id(int ruta_id) {
		this.ruta_id = ruta_id;
	}

	public String getRutaOrigen() {
		return rutaOrigen;
	}

	public void setRutaOrigen(String rutaOrigen) {
		this.rutaOrigen = rutaOrigen;
	}

	public String getRutaDestino() {
		return rutaDestino;
	}

	public void setRutaDestino(String rutaDestino) {
		this.rutaDestino = rutaDestino;
	}

	public Timestamp getRutaHorario() {
		return rutaHorario;
	}

	public void setRutaHorario(Timestamp rutaHorario) {
		this.rutaHorario = rutaHorario;
	}

	public String getFechaFormateada() {
		return fechaFormateada;
	}

	public void setFechaFormateada(String fechaFormateada) {
		this.fechaFormateada = fechaFormateada;
	}

	@Override
	public String toString() {
		return "Ruta [ruta_id=" + ruta_id + ", rutaOrigen=" + rutaOrigen + ", rutaDestino=" + rutaDestino
				+ ", rutaHorario=" + rutaHorario + ", fechaFormateada=" + fechaFormateada + "]";
	}

}
