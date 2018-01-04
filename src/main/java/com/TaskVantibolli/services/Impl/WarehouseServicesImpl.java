package com.TaskVantibolli.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskVantibolli.dao.WarehouseDAO;
import com.TaskVantibolli.hbm.Warehouse;
import com.TaskVantibolli.services.WarehouseServices;

@Service("WarehouseServices")
public class WarehouseServicesImpl implements WarehouseServices{

	@Autowired
	private WarehouseDAO warehouseDAO;
	
	public List<Warehouse> findWarehouseAll() {
		// TODO Auto-generated method stub
		 return warehouseDAO.findWarehouseAll();
	}

	public Warehouse find(Integer id) {
		// TODO Auto-generated method stub
		 return warehouseDAO.find(id);
		
	}

	public List<Warehouse> search(String keyword) {
		// TODO Auto-generated method stub
		 return warehouseDAO.search(keyword);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		 warehouseDAO.delete(id);
		
	}

}
