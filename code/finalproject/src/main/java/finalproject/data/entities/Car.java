package finalproject.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carid;
	
	@Column(name = "model", nullable = false)
	private String model;
	@Column(name = "year", nullable = false)
	private String year;
	@Column(name = "price", nullable = false)
	private float price;
	@Column(name = "rented", nullable = false)
	private String rented;
	@Column(name = "location", nullable = false)
	private String location;
	
	
	public Car(int carid, String model, String year, float price, String rented, String location) {
		super();
		this.carid = carid;
		this.model = model;
		this.year = year;
		this.price = price;
		this.rented = rented;
		this.location = location;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getRented() {
		return rented;
	}
	public void setRented(String rented) {
		this.rented = rented;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
