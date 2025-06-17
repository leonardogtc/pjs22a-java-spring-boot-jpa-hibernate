package br.com.leonardogtc.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leonardogtc.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	// Custom query methods can be defined here if needed

}
