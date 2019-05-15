package finalproject.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emplyeesid;
	@Column(name = "username", nullable = false)
	private String username;
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "availability", nullable = false)
	private String availability;
	
	
	public Employee(int emplyeesid, String username, String password, String availability) {
		super();
		this.emplyeesid = emplyeesid;
		this.username = username;
		this.password = password;
		this.availability = availability;
	}
	public int getEmplyeesid() {
		return emplyeesid;
	}
	public void setEmplyeesid(int emplyeesid) {
		this.emplyeesid = emplyeesid;
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
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}

}
