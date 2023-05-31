package food_backend_com.example.Food_Backend.Dto;


public class CustomerDTO {

    private int customerid;
    private String customername;
    private String email;
    private String password;
    private int phonenumber;
    private String address;
    
    public CustomerDTO() {
    	
    }

	
	public CustomerDTO(int customerid, String customername, String email, String password, int phonenumber,
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
		return "CustomerDTO [customerid=" + customerid + ", customername=" + customername + ", email=" + email
				+ ", password=" + password + ", phonenumber=" + phonenumber + ", address=" + address + "]";
	}

	
	
}
