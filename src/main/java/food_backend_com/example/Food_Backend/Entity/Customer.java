package food_backend_com.example.Food_Backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
    @Column(name="customer_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;
 
    @Column(name="customer_name", length = 255)
    private String customername;
 
    @Column(name="email", length = 255)
    private String email;
 
    @Column(name="password", length = 255)
    private String password;
    
    @Column(name="phonenumber", length = 255)
    private int phonenumber;

    @Column(name="address", length = 255)
    private String address;
    
    public Customer() {}

	public Customer(int customerid, String customername, String email, String password, int phonenumber,
			String address) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.address = address;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", email=" + email
				+ ", password=" + password + ", phonenumber=" + phonenumber + ", address=" + address + "]";
	}
	
}
