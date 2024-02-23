package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController
{
	@GetMapping("/")
	public String loadFrom(Model model)
	{
		model.addAttribute("product", new Product());
		return"index";
	}
	
	@PostMapping("/product")
	public String getData(Product p,Model model)
	{
		System.out.println(p);
		model.addAttribute("msg", "Data Submitted SuccesFully !!!");
		return"index";
	}

}
