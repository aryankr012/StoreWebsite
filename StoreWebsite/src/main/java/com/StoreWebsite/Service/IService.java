package com.StoreWebsite.Service;

import org.springframework.stereotype.Service;

import com.StoreWebsite.DTO.RequestCustomerDTO;
import com.StoreWebsite.DTO.RequestProductDTO;
@Service
public interface IService {

	public String Save(RequestCustomerDTO rcd);
	public String addProduct(RequestProductDTO rpd);
}
