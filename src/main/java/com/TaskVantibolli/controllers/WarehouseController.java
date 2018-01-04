package com.TaskVantibolli.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TaskVantibolli.hbm.Products;
import com.TaskVantibolli.hbm.Warehouse;
import com.TaskVantibolli.services.ProductsServices;
import com.TaskVantibolli.services.WarehouseServices;

@RestController
@RequestMapping("warehouse")
public class WarehouseController {

	
	@Autowired
	private WarehouseServices warehouseServices;
	
	private List<Warehouse> warehouseList;
	private List<Warehouse> selectionWarehouseList;
	private String WarehouseId=null;
	
	public void init() {
		warehouseList=new ArrayList<Warehouse>();
		selectionWarehouseList=new ArrayList<Warehouse>();
		warehouseList =findWarehouseAll();
	}
	
	@RequestMapping(value="findWarehouseAll" , 
			method = RequestMethod.GET,
			produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public List<Warehouse> findWarehouseAll(){
		
		warehouseList= warehouseServices.findWarehouseAll();
		return warehouseList;
	}
	
	@RequestMapping(value="delete" , 
			method = RequestMethod.POST,
			produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public void delete(String id) {
		
		warehouseServices.delete(id);
	}

	public List<Warehouse> getWarehouseList() {
		return warehouseList;
	}

	public void setWarehouseList(List<Warehouse> warehouseList) {
		warehouseList = warehouseList;
	}

	public List<Warehouse> getSelectionWarehouseList() {
		return selectionWarehouseList;
	}

	public void setSelectionWarehouseList(List<Warehouse> selectionWarehouseList) {
		this.selectionWarehouseList = selectionWarehouseList;
	}

	public String getWarehouseId() {
		return WarehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		WarehouseId = warehouseId;
	}
	
	
}
