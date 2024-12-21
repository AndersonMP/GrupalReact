package com.krakedev.buses.entidades;

public class Usuario {
	private int usuID;
	private String usuNombre;
	private String usuCorreo;

	public Usuario() {

	}

	public Usuario(int usuID) {
		this.usuID = usuID;
	}

	public Usuario(int usuID, String usuNombre, String usuCorreo) {
		super();
		this.usuID = usuID;
		this.usuNombre = usuNombre;
		this.usuCorreo = usuCorreo;
	}

	public int getUsuID() {
		return usuID;
	}

	public void setUsuID(int usuID) {
		this.usuID = usuID;
	}

	public String getUsuNombre() {
		return usuNombre;
	}

	public void setUsuNombre(String usuNombre) {
		this.usuNombre = usuNombre;
	}

	public String getUsuCorreo() {
		return usuCorreo;
	}

	public void setUsuCorreo(String usuCorreo) {
		this.usuCorreo = usuCorreo;
	}

	@Override
	public String toString() {
		return "Usuario [usuID=" + usuID + ", usuNombre=" + usuNombre + ", usuCorreo=" + usuCorreo + "]";
	}

}
