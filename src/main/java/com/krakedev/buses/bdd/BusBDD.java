package com.krakedev.buses.bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.buses.entidades.Bus;
import com.krakedev.buses.excepciones.KrakedevExceptions;
import com.krakedev.buses.utils.ConexionBDD;

public class BusBDD {
	public ArrayList<Bus> obtenerBuses() throws KrakedevExceptions {
		ArrayList<Bus> buses = new ArrayList<Bus>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Bus bus = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select * from bus;");
			rs = ps.executeQuery();

			while (rs.next()) {
				int busID = rs.getInt("bus_id");
				int busCapMax = rs.getInt("bus_cap_max");
				

				bus = new Bus(busID, busCapMax);
				buses.add(bus);
			}

		} catch (KrakedevExceptions e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevExceptions("Error al consultar: " + e.getMessage());
		}

		return buses;
	}
}
