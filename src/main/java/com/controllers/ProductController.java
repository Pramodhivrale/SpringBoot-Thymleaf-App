package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

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
	public String getData(@Valid Product p,BindingResult result,Model model)
	{
		System.out.println(p);
		
		if(result.hasErrors())
		{
			return "index";
		}
		else {
			model.addAttribute("msg", "Data Submitted SuccesFully !!!");
		}
		//model.addAttribute("msg", "Data Submitted SuccesFully !!!");
		return"index";
	}

}
