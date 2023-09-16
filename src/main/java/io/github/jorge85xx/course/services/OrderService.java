package io.github.jorge85xx.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.jorge85xx.course.entities.Order;
import io.github.jorge85xx.course.entities.User;
import io.github.jorge85xx.course.repositories.OrderRepository;

@Service //ou @component p mostrar que é um componente
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> user = orderRepository.findById(id);
		return user.get();
	}
}
