package com.StoreWebsite.DTO;

import java.util.List;

import com.StoreWebsite.Entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestCustomerDTO {
	
	private String name;
	
	private String email;
	
	private String phoneNo;
	
//	private List<Product> product;
		
}
