package br.com.leonardogtc.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leonardogtc.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	// Custom query methods can be defined here if needed

}
