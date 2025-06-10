package br.com.leonardogtc.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leonardogtc.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	// Custom query methods can be defined here if needed

}
