package com.ablogic.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ablogic.course.entities.User;
import com.ablogic.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "Adalberto José Brasaca", "aj-brasaca@hotmail.com", "3434-6515", "sifeloja");
		User user2 = new User(null, "Caroline Martini Brasaca Grant", "caroll_grant@hotmail.com", "3434-6515", "bellinha");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		
	}
	
	
}