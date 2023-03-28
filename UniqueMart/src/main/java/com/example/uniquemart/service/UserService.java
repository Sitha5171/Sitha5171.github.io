package com.example.uniquemart.service;

import com.example.uniquemart.model.SignIn;

public interface UserService {
	
	 Iterable<SignIn> findAll();

		SignIn save(SignIn signin);

		void delete(int id);

		SignIn findById(int id);

}
