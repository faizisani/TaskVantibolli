package com.TaskVantibolli.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TaskVantibolli.dao.ProductsDAO;
import com.TaskVantibolli.hbm.Products;

@Repository("productsDAO")
public class ProductsDAOImpl implements ProductsDAO
{
    @Autowired
	private SessionFactory sessionFactory;
    
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createSQLQuery("select * from products").list();
	}

	@SuppressWarnings("deprecation")
	public Products find(Integer id) {
		// TODO Auto-generated method stub
		return (Products) sessionFactory.getCurrentSession().createQuery("from products "
				+ "where prodId = :id")
				.setInteger("prodId", id)
				.uniqueResult();
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Products> search(String keyword) {
		return sessionFactory.getCurrentSession().createQuery("from products "
				+ "where prodDescription like :keyword")
				.setString("keyword", keyword)
				.list();
		
	}
	

	   public void delete(String id) {
		   Products products=new Products();
		   products.setProdId(id);
		   Session session = sessionFactory.getCurrentSession();
		   session.delete(products);
	       }

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}
