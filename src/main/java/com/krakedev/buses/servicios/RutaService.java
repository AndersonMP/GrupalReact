package com.krakedev.buses.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.buses.bdd.RutaBDD;
import com.krakedev.buses.entidades.Ruta;
import com.krakedev.buses.excepciones.KrakedevExceptions;

@Path("/ruta")
public class RutaService {
		@Path("recuperarRutas")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Response recuperarPronostico() {
			RutaBDD rutaBDD = new RutaBDD();
			ArrayList<Ruta> rutas = null;
			try {
				rutas = rutaBDD.obtenerRutas();
				return Response.ok(rutas).build();
			} catch (KrakedevExceptions e) {
				// TODO: handle exception
				e.printStackTrace();
				return Response.serverError().build();
			}

		}

		 @Path("insertar")
		    @POST
		    @Consumes(MediaType.APPLICATION_JSON)
		    public Response insertarRuta(Ruta ruta) {
		        RutaBDD rutaBDD = new RutaBDD();
		        try {
		            rutaBDD.insertarRuta(ruta);
		            return Response.ok().build();
		        } catch (KrakedevExceptions e) {
		            e.printStackTrace();
		            return Response.serverError().build();
		        }
		    }
}
