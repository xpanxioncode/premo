package com.pizza.premo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.premo.model.OrderDetail;
import com.pizza.premo.repository.OrderDetailRepository;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@Override
	public List<OrderDetail> getAllOrders() {
		return orderDetailRepository.findAll();
	}
	
	@Override
	public void saveOrder(OrderDetail orderDetail) {
		this.orderDetailRepository.save(orderDetail);
	}
}
