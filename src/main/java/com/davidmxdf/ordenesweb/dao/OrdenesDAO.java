/**
 * 
 */
package com.davidmxdf.ordenesweb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.davidmxdf.ordenesweb.BO.OrdenesBO;
import com.davidmxdf.ordenesweb.persistence.Orden;

/**
 * 
 */
public class OrdenesDAO {

	public OrdenesBO getOrden(int ordenId) {
		
		OrdenesBO obo = new OrdenesBO();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("OrdenesWeb");
		EntityManager em = emf.createEntityManager();
		
		Orden o = em.find(Orden.class, ordenId);
		
		obo.setOrdenId(o.getOrdenId());
		obo.setSucursalId(o.getSucursalId());
		obo.setFecha(o.getFecha());
		obo.setTotal(o.getTotal());
		
		return obo;
	}
	
	public boolean addOrden(OrdenesBO obo) {
		
		boolean res = false;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("OrdenesWeb");
		EntityManager em = emf.createEntityManager();
		
		Orden o = new Orden();
		
		o.setOrdenId(obo.getOrdenId());
		o.setSucursalId(obo.getSucursalId());
		o.setFecha(obo.getFecha());
		o.setTotal(o.getTotal());
		
		try {
		
			em.getTransaction().begin();
			em.persist(o);
			em.getTransaction().commit();
			res = true;
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
				
		return res;
		
	}
	
}
