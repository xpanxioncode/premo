package com.pizza.premo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pizza.premo.service.OrderDetailService;

@Controller
public class OrderDetailController {

	@Autowired
	private OrderDetailService orderDetailService;
	
	@GetMapping("/order")
	public String viewHomePage(Model model) {
		model.addAttribute("listOrders", orderDetailService.getAllOrders() );
		return "orderdetail";
	}
	
	@GetMapping("/orderadd")
	public String orderByIdByWeek(Model model) {
		model.addAttribute("listOrders", orderDetailService.getAllOrders() );
		return "orderdetail";
	}
	
	
	
	
}
