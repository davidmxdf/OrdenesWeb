/**
 * 
 */
package com.davidmxdf.ordenesweb.BO;

import java.util.Date;

/**
 * 
 */
public class OrdenesBO {
	
	private int ordenId;
	private int sucursalId;
	private Date fecha;
	private float total;
	
	
	public int getOrdenId() {
		return ordenId;
	}
	public void setOrdenId(int ordenId) {
		this.ordenId = ordenId;
	}
	public int getSucursalId() {
		return sucursalId;
	}
	public void setSucursalId(int sucursalId) {
		this.sucursalId = sucursalId;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

}
