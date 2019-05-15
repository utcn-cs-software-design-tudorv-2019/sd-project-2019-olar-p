package finalproject.data.entities;

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
@Table(name = "rental")
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rentalid;

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "customerid")
	private Customer customer;

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "carid")
	private Car car;
	
	@Column(name = "location", nullable = false)
	private String location;
	
	public Rental() {

	}
	
	public Rental(Customer customer, Car car) {
		this.car = car;
		this.customer = customer;
	}

	public int getRentalid() {
		return rentalid;
	}

	public void setRentalid(int rentalid) {
		this.rentalid = rentalid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Rental [rentalid=" + rentalid + ", customer=" + customer + ", car=" + car + ", location=" + location
				+ "]";
	}
	
	
}
