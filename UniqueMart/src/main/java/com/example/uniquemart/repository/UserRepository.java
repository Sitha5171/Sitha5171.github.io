package com.example.uniquemart.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.uniquemart.model.SignIn;

public interface UserRepository extends CrudRepository<SignIn,Integer> {

}
