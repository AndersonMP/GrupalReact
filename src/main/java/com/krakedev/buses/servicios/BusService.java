package com.krakedev.buses.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.buses.bdd.BusBDD;
import com.krakedev.buses.entidades.Bus;
import com.krakedev.buses.excepciones.KrakedevExceptions;

@Path("/bus")
public class BusService {
	@Path("recuperarBuses")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response recuperarPronostico() {
		BusBDD busBDD = new BusBDD();
		ArrayList<Bus> buses = null;
		try {
			buses = busBDD.obtenerBuses();
			return Response.ok(buses).build();
		} catch (KrakedevExceptions e) {
			// TODO: handle exception
			e.printStackTrace();
			return Response.serverError().build();
		}

	}
	@POST
    @Path("/insertarBus")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertarBus(Bus bus) {
        BusBDD busBDD = new BusBDD();
        try {
            busBDD.insertarBus(bus);
            return Response.ok("Bus insertado correctamente").build();
        } catch (KrakedevExceptions e) {
            e.printStackTrace();
            return Response.serverError().entity("Error al insertar bus: " + e.getMessage()).build();
        }
    }

}
