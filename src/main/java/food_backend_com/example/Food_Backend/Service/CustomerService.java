package food_backend_com.example.Food_Backend.Service;





import food_backend_com.example.Food_Backend.Dto.CustomerDTO;
import food_backend_com.example.Food_Backend.Dto.LoginDTO;

import food_backend_com.example.Food_Backend.respons.LoginResponce;


public interface CustomerService {
	
	String addCustomer(CustomerDTO customeDTO);

	LoginResponce loginCustomer(LoginDTO loginDTO);

	

}
