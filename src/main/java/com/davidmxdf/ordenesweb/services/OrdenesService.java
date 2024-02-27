/**
 * 
 */
package com.davidmxdf.ordenesweb.services;

import java.util.Date;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.davidmxdf.ordenesweb.BO.OrdenesBO;
import com.davidmxdf.ordenesweb.bussiness.BussinessOrdenes;

/**
 * 
 */
@Path("/services")
public class OrdenesService {

	
	@POST
	@Path("/crud/addorden")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addLibro(@QueryParam("ordenId") int ordenId,
							 @QueryParam("sucursalId") int sucursalId,
							 @QueryParam("fecha") String fecha,
							 @QueryParam("total") float total){
		
		BussinessOrdenes bo = new BussinessOrdenes();
		OrdenesBO obo = new OrdenesBO();
		
		obo.setOrdenId(ordenId);
		obo.setSucursalId(sucursalId);
		obo.setFecha(new Date(fecha));
		obo.setTotal(total);
		
		return null;
	}
}
