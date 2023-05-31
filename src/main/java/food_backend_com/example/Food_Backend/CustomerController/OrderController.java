package food_backend_com.example.Food_Backend.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import food_backend_com.example.Food_Backend.Dto.OrderDTO;
import food_backend_com.example.Food_Backend.Entity.Customer;
import food_backend_com.example.Food_Backend.Entity.Orders;
import food_backend_com.example.Food_Backend.Repo.OrderRepo;
import food_backend_com.example.Food_Backend.Service.OrderService;

@RestController
@CrossOrigin
@RequestMapping(value="api/v1/orders")

public class OrderController {

	@Autowired(required = true)
	private OrderService orderservice;
	
	@Autowired
	private OrderRepo ordeRepo;
	
	@PostMapping(path="/order")
	public Orders saveOrders(@RequestBody Orders or)
	{
		return ordeRepo.save(or);
	}
	@DeleteMapping(path="/delete/{orderid}")
	public String deleteUsingID(@PathVariable int orderid) {
		ordeRepo.deleteById(orderid);
		return "Delete Success";
	
	}
	
	@GetMapping("/findall")
	//find all
	public List<Orders>FindAllOrders(){
		return ordeRepo.findAll();	
	}
}
