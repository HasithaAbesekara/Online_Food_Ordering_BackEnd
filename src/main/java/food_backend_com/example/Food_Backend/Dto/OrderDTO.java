package food_backend_com.example.Food_Backend.Dto;



public class OrderDTO {

	private int orderid;
	private String customername;
	private String email;
    private int phonenumber;
    private String address;
    private String foodcatgory;
    private String details;
	public OrderDTO() {
		
	}
	public OrderDTO(int orderid, String customername, String email, int phonenumber, String address, String foodcatgory,
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
		return "OrderDTO [orderid=" + orderid + ", customername=" + customername + ", email=" + email + ", phonenumber="
				+ phonenumber + ", address=" + address + ", foodcatgory=" + foodcatgory + ", details=" + details + "]";
	}
	
    
    
    
    
}
