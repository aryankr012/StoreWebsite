package com.StoreWebsite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StoreWebsite.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
