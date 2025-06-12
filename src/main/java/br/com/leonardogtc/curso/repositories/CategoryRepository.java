package br.com.leonardogtc.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leonardogtc.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	// Custom query methods can be defined here if needed

}
