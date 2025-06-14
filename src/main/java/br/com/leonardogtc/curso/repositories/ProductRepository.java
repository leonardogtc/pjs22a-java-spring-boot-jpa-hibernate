package br.com.leonardogtc.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leonardogtc.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	// Custom query methods can be defined here if needed

}
