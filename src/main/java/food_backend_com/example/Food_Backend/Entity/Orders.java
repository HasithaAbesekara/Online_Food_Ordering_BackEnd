package food_backend_com.example.Food_Backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	@Id
	@Column(name="order_id",length=45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;
	
	@Column(name="CustomerName", length = 255)
	private String customername;
	 
	@Column(name="email", length = 255)
	private String email;
	
	@Column(name="phonenumber", length = 255)
    private int phonenumber;
	
	@Column(name="address", length = 255)
    private String address;
	
	@Column(name="FoodCatgory", length = 255)
    private String foodcatgory;
	
	@Column(name="Details", length = 400)
    private String details;

	public Orders() {
		
	}

	public Orders(int orderid, String customername, String email, int phonenumber, String address, String foodcatgory,
			String details) {
		super();
		this.orderid = orderid;
		this.customername = customername;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.foodcatgory = foodcatgory;
		this.details = details;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
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

	public String getFoodcatgory() {
		return foodcatgory;
	}

	public void setFoodcatgory(String foodcatgory) {
		this.foodcatgory = foodcatgory;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", customername=" + customername + ", email=" + email + ", phonenumber="
				+ phonenumber + ", address=" + address + ", foodcatgory=" + foodcatgory + ", details=" + details + "]";
	}
	
	
	
	
}
