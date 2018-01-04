package com.TaskVantibolli.hbm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// default package
// Generated Dec 31, 2017 10:12:37 PM by Hibernate Tools 5.2.6.Final



/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users")
public class Users implements java.io.Serializable {
    
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	@Column
	private String userName;
	@Column
	private String employeeId;
	@Column
	private String description;
	@Column
	private String password;

	public Users() {
	}

	public Users(String userName, String employeeId, String description,String password) {
		this.userName = userName;
		this.employeeId = employeeId;
		this.description = description;
		this.password= password;
	}



	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
