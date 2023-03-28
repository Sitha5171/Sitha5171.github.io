package com.example.uniquemart.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.uniquemart.model.SignIn;
import com.example.uniquemart.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
    
	UserRepository userRepository;
	

	public UserServiceImpl(UserRepository userRepository) {
	
		this.userRepository = userRepository;
	}
	
	@Override
	public Iterable<SignIn> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public SignIn save(SignIn signin) {
		// TODO Auto-generated method stub
		return userRepository.save(signin);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public SignIn findById(int id) {
		// TODO Auto-generated method stub

		Optional<SignIn> result = userRepository.findById(id);

		SignIn theSignIn = null;

		if (result.isPresent()) {

			theSignIn = result.get();

		}

		else {

			// we didn't find the Post

			throw new RuntimeException("Did not find item id - " + id);

		}

		return theSignIn;

	}

}
