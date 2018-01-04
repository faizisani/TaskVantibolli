package com.TaskVantibolli.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TaskVantibolli.hbm.Products;
import com.TaskVantibolli.services.ProductsServices;

@RestController
@RequestMapping("products")
public class ProductsController {

	@Autowired
	private ProductsServices productsServics;
	
	private List<Products> prodList;
	private List<Products> selectionProdList;
	private String prodId=null;
	
	public void init() {
		prodList=new ArrayList<Products>();
		selectionProdList=new ArrayList<Products>();
		prodList = findAll();
	}
	
	@RequestMapping(value="findAll" , 
			method = RequestMethod.GET,
			produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public List<Products> findAll(){
		
		prodList= productsServics.findAll();
		return prodList;
	}
	
	@RequestMapping(value="delete" , 
			method = RequestMethod.POST,
			produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public void delete(String id) {
		
		productsServics.delete(id);
	}
	
	 public void onRowSelect(SelectEvent event) {
		 
		 prodId= ((Products) event.getObject()).getProdId();
	    }
	 
	 public void deleteProd(SelectEvent event) {
		 
		 delete(prodId);
		  
	        FacesMessage msg = new FacesMessage("Selected Product Deleted");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	        prodList = new ArrayList<Products>();
	        prodList=findAll();
		 
	 }
	
	public List<Products> getProdList() {
		return prodList;
	}

	public void setProdList(List<Products> prodList) {
		this.prodList = prodList;
	}

	public List<Products> getSelectionProdList() {
		return selectionProdList;
	}

	public void setSelectionProdList(List<Products> selectionProdList) {
		this.selectionProdList = selectionProdList;
	}
	
	
}
