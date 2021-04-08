package com.pizza.premo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pizza.premo.service.ProductsService;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductsService productsService;
	
	@GetMapping("/menu")
	public String viewHomePage(Model model) {
		model.addAttribute("listProducts", productsService.getAllProducts());
		return "menu";
	}
	
}
