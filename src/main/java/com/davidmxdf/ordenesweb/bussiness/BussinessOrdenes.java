/**
 * 
 */
package com.davidmxdf.ordenesweb.bussiness;

import com.davidmxdf.ordenesweb.BO.OrdenesBO;
import com.davidmxdf.ordenesweb.dao.OrdenesDAO;

/**
 * 
 */
public class BussinessOrdenes {
	
	public OrdenesBO getOrden(int ordenId) {
		
		OrdenesDAO odao = new OrdenesDAO();
		OrdenesBO obo = odao.getOrden(ordenId);
		
		return obo;
	}
	
	public String addOrden(OrdenesBO obo) {
		
		String msg = "";
		OrdenesDAO odao = new OrdenesDAO();
		
		if (odao.addOrden(obo)) {
			msg = "Se agrego la orden con id: "+obo.getOrdenId();
		}
		else {
			msg = "No se agrego la orden con id: "+obo.getOrdenId();
		}
		
		return msg;
	}

}
