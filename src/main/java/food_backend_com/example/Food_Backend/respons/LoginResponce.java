package food_backend_com.example.Food_Backend.respons;

public class LoginResponce {
	String message;
	Boolean status;

	public LoginResponce() {
		
	}

	public LoginResponce(String message, Boolean status) {
		super();
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoginResponce [message=" + message + ", status=" + status + "]";
	}
	
}
