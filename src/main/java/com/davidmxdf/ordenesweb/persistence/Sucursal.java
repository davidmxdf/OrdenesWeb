/**
 * 
 */
package com.davidmxdf.ordenesweb.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="sucursales")
public class Sucursal {

	@Id
	@Column(name="sucursal_id")
	private int sucursalId;
	
	private String nombre;
	
	public int getSucursalId() {
		return sucursalId;
	}
	public void setSucursalId(int sucursalId) {
		this.sucursalId = sucursalId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
