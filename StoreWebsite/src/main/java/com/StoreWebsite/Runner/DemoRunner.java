package com.StoreWebsite.Runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.StoreWebsite.Entity.Customer;
import com.StoreWebsite.Entity.Dimensions;
import com.StoreWebsite.Entity.Product;
import com.StoreWebsite.Entity.Specifications;
import com.StoreWebsite.Repository.CustomerRepo;

@Component
public class DemoRunner implements CommandLineRunner{
	
	@Autowired
	private CustomerRepo crepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		// Dimensions
        Dimensions dim = new Dimensions();
        dim.setLength(30);
        dim.setBreath(20);
        dim.setHeight(5);
		
        //Specifications
		Specifications spec = new Specifications();
        spec.setDimensions(dim);
        spec.setWeight(2);
        spec.setColour(Arrays.asList("Red", "Black", "Silver"));
        
     // Dimensions for spec2
        Dimensions dim2 = new Dimensions();
        dim2.setLength(40);
        dim2.setBreath(25);
        dim2.setHeight(6);

        // Specifications spec2 using setters
        Specifications spec2 = new Specifications();
        spec2.setDimensions(dim2);
        spec2.setWeight(3);
        spec2.setColour(Arrays.asList("Blue", "White"));
		
		
		
		// Product
        Product product = new Product();
        product.setName("Laptop");
        product.setBrandName("Dell");
        product.setModelNumber("XPS-15");
        product.setDescription("High-end laptop");
        product.setQuantity(5);
        product.setSpecifications(Arrays.asList(spec,spec2));
        
     // Dimensions for tabletSpec1
        Dimensions tabletDim1 = new Dimensions();
        tabletDim1.setLength(25);
        tabletDim1.setBreath(17);
        tabletDim1.setHeight(1);

        // Specifications tabletSpec1 using setters
        Specifications tabletSpec1 = new Specifications();
        tabletSpec1.setDimensions(tabletDim1);
        tabletSpec1.setWeight(5);
        tabletSpec1.setColour(Arrays.asList("Grey", "White"));

     // Dimensions for tabletSpec2
        Dimensions tabletDim2 = new Dimensions();
        tabletDim2.setLength(26);
        tabletDim2.setBreath(18);
        tabletDim2.setHeight(1);

        // Specifications tabletSpec2 using setters
        Specifications tabletSpec2 = new Specifications();
        tabletSpec2.setDimensions(tabletDim2);
        tabletSpec2.setWeight(6);
        tabletSpec2.setColour(Arrays.asList("Black", "Blue"));

        Product tablet = new Product();
        tablet.setName("Tablet");
        tablet.setBrandName("Apple");
        tablet.setModelNumber("iPad Pro");
        tablet.setDescription("High-performance tablet for professionals");
        tablet.setQuantity(7);
        tablet.setSpecifications(Arrays.asList(tabletSpec1, tabletSpec2));

  

		// User
        Customer user= new Customer();
        user.setName("John Doe");
        user.setEmail("john@example.com");
        user.setPhoneNo("9430087643");
        user.setProduct(Arrays.asList(product,tablet));
        
        
        crepo.save(user);
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Data Insterted");
        System.out.println("---------------------------------------------------------------------");

        crepo.findAll().forEach(System.out::println);
		
	}
}
