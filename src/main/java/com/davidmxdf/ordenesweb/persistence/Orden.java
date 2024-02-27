/**
 * 
 */
package com.davidmxdf.ordenesweb.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table
public class Orden {
	@Id
	@Column (name="orden_id")
	private int ordenId;
	@Column (name="sucursal_id")
	private int sucursalId;
	private Date fecha;
	private float total;
	
	
	
	public Orden() {
		
	}

	public Orden(int ordenId, int sucursalId, Date fecha, float total) {
		super();
		this.ordenId = ordenId;
		this.sucursalId = sucursalId;
		this.fecha = fecha;
		this.total = total;
	}
	
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
