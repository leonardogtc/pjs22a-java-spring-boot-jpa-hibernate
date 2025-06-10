package br.com.leonardogtc.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leonardogtc.curso.entities.Order;
import br.com.leonardogtc.curso.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	// Lista todos os usuários
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	// Busca por ID 
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
