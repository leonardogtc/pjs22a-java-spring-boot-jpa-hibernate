package br.com.leonardogtc.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.leonardogtc.curso.entities.User;
import br.com.leonardogtc.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Oliver", "oliverptc@gmail.com", "11999999999", "123456");
		User u2 = new User(null, "Lucia", "luciaptc@gmail.com", "11999999998", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
