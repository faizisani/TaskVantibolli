package com.TaskVantibolli.controllers;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.TaskVantibolli.services.UserServices;

import javax.inject.Named;

@Named
@ManagedBean
@Scope("session")
public class HelloController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nextPage = "";
	private String message;
    private String userName;
    private String password;
    
    @Autowired
    public UserServices userServices;
    
	public HelloController() {
		userName = "";
		password = "";
		message = "";
	}
	
	
	
	public String showHello() {
		
		return "Show Hello to ManagedBean HelloController";
	}
	
	public String login() {
		
		System.out.println("Welcome to login function"+userName+":::"+password);
		
		if(userName!=null && password!=null)
		{
		boolean userExists=userServices.checkLogin(userName, password);
		if(userExists){
			System.out.println("User Exists");
			
			 return "dashboard.jsf?faces-redirect=true";
		}
		else {
			System.out.println("User Not Exists");
			return "";
		}
		}
		else {
			System.out.println("User Name or password is null");
			return "";
			
		}
		

		
		
		
	}

	public String getNextPage() {
		return nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
