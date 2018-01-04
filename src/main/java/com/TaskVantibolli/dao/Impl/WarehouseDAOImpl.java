package com.TaskVantibolli.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TaskVantibolli.dao.WarehouseDAO;
import com.TaskVantibolli.hbm.Products;
import com.TaskVantibolli.hbm.Warehouse;

@Repository("warehouseDAO")
public class WarehouseDAOImpl implements WarehouseDAO{

	 @Autowired
		private SessionFactory sessionFactory;
	 
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Warehouse> findWarehouseAll() {
		// TODO Auto-generated method stubreturn
		return sessionFactory.openSession().createSQLQuery("select * from warehouse").list();
		
		
	}

	@SuppressWarnings("deprecation")
	public Warehouse find(Integer id) {
		// TODO Auto-generated method stub
		return (Warehouse) sessionFactory.getCurrentSession().createSQLQuery("select * from warehouse "
				+ "where warehouseId = :id")
				.setInteger("warehouseId", id)
				.uniqueResult();
		
	}

	@SuppressWarnings("unchecked")
	public List<Warehouse> search(String keyword) {
		// TODO Auto-generated method stub
		
		 return sessionFactory.getCurrentSession().createQuery("from warehouse "
				+ "where warehouseDescp like :keyword")
				.setString("keyword", keyword)
				.list();
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		 Warehouse warehouse=new Warehouse();
		   warehouse.setWarehouseId(id);
		   Session session = sessionFactory.getCurrentSession();
		   session.delete(warehouse);
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

}
