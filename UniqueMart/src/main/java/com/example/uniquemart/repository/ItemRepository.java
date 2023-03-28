package com.example.uniquemart.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.uniquemart.model.Item;

public interface ItemRepository extends CrudRepository<Item,Integer> {

}
