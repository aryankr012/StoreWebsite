package com.StoreWebsite.Service;
import com.StoreWebsite.StoreWebsiteApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StoreWebsite.DTO.RequestCustomerDTO;
import com.StoreWebsite.DTO.RequestProductDTO;
import com.StoreWebsite.Entity.Customer;
import com.StoreWebsite.Entity.Product;
import com.StoreWebsite.Repository.CustomerRepo;
import com.StoreWebsite.Repository.ProductRepo;

@Service
public class UserService implements IService{


	@Autowired
	private CustomerRepo crepo;
	
	@Autowired
	private ProductRepo prepo;

    private Long savedCustomerid;
	
	public String Save(RequestCustomerDTO rcd) {
		System.out.println("Hello Contrller - 4");
		
		
		Customer customer = new Customer();
		customer.setName(rcd.getName());
		customer.setEmail(rcd.getEmail());
		customer.setPhoneNo(rcd.getPhoneNo());

		
		
		Customer saveCustomer = crepo.save(customer);

		savedCustomerid = saveCustomer.getId();
		
		
		return null;
	}
	
	@Override
	public String addProduct(RequestProductDTO rpd) {
		
		Optional<Customer> customer = Optional.of(crepo.findById(savedCustomerid)
					.orElseThrow(()->new RuntimeException("Customer Not Found")));

		Product product = new Product();
		product.setName(rpd.getName());
		product.setBrandName(rpd.getBrandName());
		product.setDescription(rpd.getDescription());
		product.setModelNumber(rpd.getModelNumber());
		product.setQuantity(rpd.getQuantity());

		customer.get().getProduct().add(product);
		
//		customer.setProduct(product);
		crepo.save(customer.get());
//		prepo.save(product);
//		crepo.findOne(null)
//		crepo.findById(null)
		
		System.out.println(product);
		return null;
	}
}
