package com.pizza.premo.service;


import java.util.List;

import com.pizza.premo.model.OrderDetail;

public interface OrderDetailService {
	List <OrderDetail> getAllOrders();
	void saveOrder(OrderDetail orderDetail);
}
