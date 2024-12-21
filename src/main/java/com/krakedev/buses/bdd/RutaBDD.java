package com.krakedev.buses.bdd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.krakedev.buses.entidades.Ruta;
import com.krakedev.buses.excepciones.KrakedevExceptions;
import com.krakedev.buses.utils.ConexionBDD;

public class RutaBDD {
	public ArrayList<Ruta> obtenerRutas() throws KrakedevExceptions {
		ArrayList<Ruta> rutas = new ArrayList<Ruta>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Ruta ruta = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select * from ruta;");
			rs = ps.executeQuery();

			while (rs.next()) {
				int rutaID = rs.getInt("ruta_id");
				String rutaOrigen = rs.getString("ruta_origen");
				String rutaDestino = rs.getString("ruta_destino");
				Timestamp timestamp = rs.getTimestamp("ruta_horario");
				long milis = timestamp.getTime();
				String fechaFormateada = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(milis));

				ruta = new Ruta(rutaID, rutaOrigen, rutaDestino, fechaFormateada);
				rutas.add(ruta);
			}

		} catch (KrakedevExceptions e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevExceptions("Error al consultar: " + e.getMessage());
		}

		return rutas;
	}
}
