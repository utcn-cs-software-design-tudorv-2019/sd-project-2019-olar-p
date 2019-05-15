package finalproject.data.entities;

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
	@Column(name = "customerid", nullable=false)
	private String customerid;
	@Column(name = "username", nullable = false)
	private String username;
	@Column(name = "password", nullable = false)
	private String password;
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<Car >myCars;
	
	public Customer() {
		
	}

	public Customer(String customerid, String username, String password, ArrayList<Car> myCars) {
		super();
		this.customerid = customerid;
		this.username = username;
		this.password = password;
		this.myCars = new ArrayList<Car>();
	}

	public String getCustomerId() {
		return customerid;
	}

	public void setCustomerId(String customerid) {
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

	@Override
	public String toString() {
		return "Customer [id=" + customerid + ", username=" + username + ", password=" + password + ", myCars=" + myCars + "]";
	}
	
	
	
	
}
