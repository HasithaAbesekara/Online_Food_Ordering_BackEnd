package food_backend_com.example.Food_Backend.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import food_backend_com.example.Food_Backend.Dto.OrderDTO;
import food_backend_com.example.Food_Backend.Entity.Orders;
import food_backend_com.example.Food_Backend.Repo.OrderRepo;
import food_backend_com.example.Food_Backend.Service.OrderService;

@Service
public class OrderIMPL implements  OrderService{
	
	@Autowired
	private OrderRepo orderRepo;

	@Override
	public String addOrder(OrderDTO orderdto) {
		Orders orders=new Orders(
				orderdto.getOrderid(),
				orderdto.getCustomername(),
				orderdto.getEmail(),
				orderdto.getPhonenumber(),
				orderdto.getAddress(),
				orderdto.getFoodcatgory(),
				orderdto.getDetails());
		
		orderRepo.save(orders);
		return orders.getCustomername();
				
	}
}
