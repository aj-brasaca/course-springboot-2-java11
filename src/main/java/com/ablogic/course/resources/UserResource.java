package com.ablogic.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablogic.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Adalberto José Brasaca", "aj-brasaca@hotmail.com", "3434-6515", "sifeloja");
		return ResponseEntity.ok().body(user);
	}
}
