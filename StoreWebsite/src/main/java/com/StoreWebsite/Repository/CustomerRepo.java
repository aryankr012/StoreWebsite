package com.StoreWebsite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StoreWebsite.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
