package com.TaskVantibolli.dao;

import java.util.List;

import com.TaskVantibolli.hbm.Products;

public interface ProductsDAO {

	public List<Products> findAll();
	
	public Products find (Integer id);
	
	public List<Products> search(String keyword);

	public void delete(String id);

	
}
