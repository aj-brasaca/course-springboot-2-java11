package com.ablogic.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ablogic.course.entities.Category;
import com.ablogic.course.entities.Order;
import com.ablogic.course.entities.User;
import com.ablogic.course.entities.enums.OrderStatus;
import com.ablogic.course.repositories.CategoryRepository;
import com.ablogic.course.repositories.OrderRepository;
import com.ablogic.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User user1 = new User(null, "Adalberto José Brasaca", "aj-brasaca@hotmail.com", "3434-6515", "sifeloja");
		User user2 = new User(null, "Caroline Martini Brasaca Grant", "caroll_grant@hotmail.com", "3434-6515", "bellinha");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2);
		Order o3 = new Order(null, Instant.parse("2019-06-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user1);
				
		userRepository.saveAll(Arrays.asList(user1, user2));
				
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
				
	}
	
	
}
