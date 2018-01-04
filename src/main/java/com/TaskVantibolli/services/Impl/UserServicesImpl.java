package com.TaskVantibolli.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskVantibolli.dao.UsersDAO;
import com.TaskVantibolli.services.UserServices;

@Service("usersService")
public class UserServicesImpl implements UserServices {

	 @Autowired
	 private UsersDAO usersDAO;

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}


	public boolean checkLogin(String userName, String password){
              System.out.println("In Service class...Check Login");
              return usersDAO.checkLogin(userName, password);
       }
}
