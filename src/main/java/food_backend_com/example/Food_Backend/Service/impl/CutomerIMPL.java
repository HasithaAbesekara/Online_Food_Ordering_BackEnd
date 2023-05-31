package food_backend_com.example.Food_Backend.Service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import food_backend_com.example.Food_Backend.Dto.CustomerDTO;
import food_backend_com.example.Food_Backend.Dto.LoginDTO;
import food_backend_com.example.Food_Backend.Entity.Customer;
import food_backend_com.example.Food_Backend.Repo.CustomerRepo;
import food_backend_com.example.Food_Backend.Service.CustomerService;
import food_backend_com.example.Food_Backend.respons.LoginResponce;

@Service
public class CutomerIMPL implements  CustomerService{
	@Autowired
	private CustomerRepo customerRepo;
	

	@Autowired
	private PasswordEncoder passwordEncoder;
	

	@Override
	public String addCustomer(CustomerDTO customeDTO) {
		 Customer customer = new Customer(
				 customeDTO.getCustomerid(),
				 customeDTO.getCustomername(),
				 customeDTO.getEmail(),
				 this.passwordEncoder.encode(customeDTO.getPassword()),
				 customeDTO.getPhonenumber(),
				 customeDTO.getAddress()
	      
	        );
	 
		 customerRepo.save(customer);
	 
	     return customer.getCustomername();
	}
	CustomerDTO customeDTO;
	
	
	
	
	@Override
	public LoginResponce loginCustomer(LoginDTO loginDTO) {
		Customer customer1 = customerRepo.findByEmail(loginDTO.getEmail());
        if (customer1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = customer1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Customer> customer = customerRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (customer.isPresent()) {
                    return new LoginResponce("Login Success", true);
                } else {
                    return new LoginResponce("Login Failed", false);
                }
            } else {
 
                return new LoginResponce("password Not Match", false);
            }
        }else {
            return new LoginResponce("Email not exits", false);
        }
	}

	

}
