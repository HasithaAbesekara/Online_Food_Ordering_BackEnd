package food_backend_com.example.Food_Backend.CustomerController;






import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food_backend_com.example.Food_Backend.Dto.CustomerDTO;
import food_backend_com.example.Food_Backend.Dto.LoginDTO;
import food_backend_com.example.Food_Backend.Entity.Customer;
import food_backend_com.example.Food_Backend.Repo.CustomerRepo;
import food_backend_com.example.Food_Backend.Service.CustomerService;

import food_backend_com.example.Food_Backend.respons.LoginResponce;


@RestController
@CrossOrigin
@RequestMapping(value="api/v1/customer")

public class CustomerController {
	
	@Autowired(required = true)
	private CustomerService customerService;
	
	@Autowired
	private CustomerRepo repo;
	
	
	
	/*
	@PostMapping(path="/save")
	public String saveCustome(@RequestBody CustomerDTO customeDTO)
	{
		String id = customerService.addCustomer(customeDTO);
		return id;
	}
	*/
	@PostMapping(path="/login")
	public ResponseEntity<?> loginCustomer(@RequestBody LoginDTO loginDTO){
		LoginResponce loginResponce=customerService.loginCustomer(loginDTO);
		return ResponseEntity.ok(loginResponce);
	}
	@PostMapping(path="/save")
	public Customer saveCustome(@RequestBody Customer ct) {
		return repo.save(ct);
	}
	
	@GetMapping(path="/findbyid/{customerid}")
	public Customer findUsingId(@PathVariable int customerid) {
		return repo.findById(customerid).orElse(null);
	}
	
	@DeleteMapping(path="/delete/{customerid}")
	public String deleteUsingID(@PathVariable int customerid) {
		repo.deleteById(customerid);
		return "Delete Success";
	
	}
	
	@GetMapping("/findall")
	//find all
	public List<Customer>FindAllStudents(){
		return repo.findAll();	
	}
	
	
	
	
	
}
