package com.TaskVantibolli.dao;

import java.util.List;

import com.TaskVantibolli.hbm.Warehouse;

public interface WarehouseDAO {

	public List<Warehouse> findWarehouseAll();

	public Warehouse find(Integer id);

	public List<Warehouse> search(String keyword);

	public void delete(String id);
}
