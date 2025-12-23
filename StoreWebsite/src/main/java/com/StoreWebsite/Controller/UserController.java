package com.StoreWebsite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.StoreWebsite.DTO.RequestCustomerDTO;
import com.StoreWebsite.DTO.RequestProductDTO;
import com.StoreWebsite.Service.IService;

@Controller
public class UserController {
	
	@Autowired
	private IService service;
	
	@GetMapping("/")
	public String Welcome() {
		System.out.println("Hello Contrller - 1");
		return "hello";
	}
	
	@PostMapping("/")
	public String saveUser(@ModelAttribute RequestCustomerDTO rcd, Model model) {
	    service.Save(rcd);
	    
	    model.addAttribute("rcd", rcd);  
	    return "result";
	}
	
	@GetMapping("/product")
	public String addProduct() {
//		System.out.println(rp);
//		System.out.println("post");
		return "addProduct";
	}
	
	@PostMapping("/product")
	public String adProduct(@ModelAttribute RequestProductDTO rpd) {
//		System.out.println("Get");
		
		System.out.println("Before");
		service.addProduct(rpd);
		System.out.println("After");
		System.out.println("Data inserted");
		return "null";
	}
	
	

	}

