package food_backend_com.example.Food_Backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import food_backend_com.example.Food_Backend.Entity.Orders;

@EnableJpaRepositories
@Repository
public interface OrderRepo extends JpaRepository<Orders,Integer>{


}
