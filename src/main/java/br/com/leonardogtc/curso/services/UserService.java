package br.com.leonardogtc.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leonardogtc.curso.entities.User;
import br.com.leonardogtc.curso.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	// Lista todos os usuários
	public List<User> findAll() {
		return repository.findAll();
	}
	
	// Busca por ID 
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
