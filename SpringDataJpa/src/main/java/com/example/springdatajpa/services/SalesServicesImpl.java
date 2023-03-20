package com.example.springdatajpa.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springdatajpa.data.entity.Sales;
import com.example.springdatajpa.repository.SalesRepository;

@Service
public class SalesServicesImpl implements SalesService {


private final SalesRepository salesRepository;
	

	public SalesServicesImpl(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	@Override
	public Sales getSale(int id) {
		Optional<Sales> sale = salesRepository.findById((long) id);
		return sale.orElse(null);
	}
}