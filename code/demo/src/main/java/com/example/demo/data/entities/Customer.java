package com.example.demo.data.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerid")
	private int customerid;
	@Column(name = "name")
	private String name;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<Car>myCars;
	
	public Customer() {
		
	}

	public Customer(int customerid, String username, String password, ArrayList<Car> myCars, String name) {
		super();
		this.customerid = customerid;
		this.username = username;
		this.password = password;
		this.myCars = new ArrayList<Car>();
		this.name = name;
	}

	public int getCustomerId() {
		return customerid;
	}

	public void setCustomerId(int customerid) {
		this.customerid = customerid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Car> getMyCars() {
		return myCars;
	}

	public void setMyCars(List<Car> myCars) {
		this.myCars = myCars;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + customerid + ", username=" + username + ", password=" + password + ", myCars=" + myCars + "]";
	}
	
	
}
