package com.example.uniquemart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.uniquemart.model.SignIn;
import com.example.uniquemart.service.UserService;

@RestController
public class UserController {

	@Autowired

	UserService userService;

	public UserController(@Autowired UserService userService) {

		this.userService = userService;

	}

	@GetMapping("/signin")

	public Iterable<SignIn> getAllPost() {

		return userService.findAll();

	}

	@GetMapping("/signin/{id}")
	public SignIn findById(@PathVariable("id") int id) {
		return  userService.findById(id);

	}

	@PostMapping("/signin")
	public SignIn save(@RequestBody SignIn signin) {
		return userService.save(signin);
	}

	@DeleteMapping("/signin/{id}")
	public void delete(@PathVariable int id) {
		userService.delete(id);

	}

	@PutMapping("/signin")
	public SignIn update(@RequestBody SignIn signin) {
		return userService.save(signin);
	}
}