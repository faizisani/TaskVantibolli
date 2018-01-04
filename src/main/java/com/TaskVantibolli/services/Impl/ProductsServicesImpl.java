package com.TaskVantibolli.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TaskVantibolli.dao.ProductsDAO;
import com.TaskVantibolli.hbm.Products;
import com.TaskVantibolli.services.ProductsServices;

@Service("productsServices")
public class ProductsServicesImpl implements ProductsServices{

	@Autowired
	private ProductsDAO productsDAO;
	
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return productsDAO.findAll();
	}

	public Products find(Integer id) {
		// TODO Auto-generated method stub
		return productsDAO.find(id);
	}

	public List<Products> search(String keyword) {
		// TODO Auto-generated method stub
		return productsDAO.search(keyword);
	}
	
	public void delete(String id) {
		productsDAO.delete(id);
	}

}
