package com.example.demo.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	private int carid;
	@Column(name = "name")
	public String name;
	@Column(name = "year")
	private String year;
	@Column(name = "price")
	private int price;
	@Column(name = "rented")
	private String rented;
	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public int getCarId() {
		return carid;
	}
	public void setCarId(int carid) {
		this.carid = carid;
	}
	public String getCarName() {
		return name;
	}
	public void setCarName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRented() {
		return rented;
	}
	public void setRented(String rented) {
		this.rented = rented;
	}
	
}
