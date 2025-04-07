package com.srk.operations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srk.entity.ProductDetails;
import com.srk.entity.UserInformation;
import com.srk.repository.ProductDetailsRepository;
import com.srk.repository.UserDetailsRepo;

@Component
public class DatabaseOperationsTwo {

	@Autowired
	ProductDetailsRepository productDetailsRepository;
	
	// adding more than one product. 
	
	public void addMoreProducts() {
		
		// ArrayList
		List<ProductDetails> allProducts = new ArrayList<>();
		allProducts.add(new ProductDetails(222, "Mouse", 5000));
		allProducts.add(new ProductDetails(223, "Keyboard", 6000));
		allProducts.add(new ProductDetails(224, "Speaker", 7000));
		allProducts.add(new ProductDetails(225, "SanDisk", 8000));
		allProducts.add(new ProductDetails(226, "FlashDisk", 9000));
		productDetailsRepository.saveAll(allProducts);
		
	}
	
}
