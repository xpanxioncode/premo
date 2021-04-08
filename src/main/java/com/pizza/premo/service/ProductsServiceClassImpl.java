package com.pizza.premo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.premo.model.Products;
import com.pizza.premo.repository.ProductsRepository;

@Service
public class ProductsServiceClassImpl implements ProductsService{
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@Override
	public List<Products> getAllProducts(){
		return productsRepository.findAll();
	}
	
}
