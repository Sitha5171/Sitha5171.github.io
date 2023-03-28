package com.example.uniquemart.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.uniquemart.model.Item;
import com.example.uniquemart.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	

	ItemRepository postRepository;

	public ItemServiceImpl(ItemRepository postRepository) {

	this.postRepository = postRepository;

	}

	@Override

	public Iterable<Item> findAll() {

	// TODO Auto-generated method stub

	return postRepository.findAll();

	}

	@Override

	public Item save(Item item) {

	// TODO Auto-generated method stub

	return postRepository.save(item);

	}

	@Override

	public void delete(int id) {

	// TODO Auto-generated method stub

	postRepository.deleteById(id);;

	}

	@Override

	public Item findById(int theId) {

	Optional<Item> result = postRepository.findById(theId);

	Item theItem = null;

	if (result.isPresent()) {

	theItem = result.get();

	}

	else {

	// we didn't find the Post

	throw new RuntimeException("Did not find post id - " + theId);

	}

	return theItem;

	}

}
