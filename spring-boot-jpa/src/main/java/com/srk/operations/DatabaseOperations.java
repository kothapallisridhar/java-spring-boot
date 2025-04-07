package com.srk.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srk.entity.ProductDetails;
import com.srk.entity.UserInformation;
import com.srk.repository.ProductDetailsRepository;
import com.srk.repository.UserDetailsRepo;

@Component
public class DatabaseOperations {

	@Autowired
	ProductDetailsRepository productDetailsRepository;
	
	@Autowired
	UserDetailsRepo userDetailsRepo;
	
//	public void addProductInformation() {
//		//create entity object
//		ProductDetails p1 = new ProductDetails();
//		p1.setProductId(1123);
//		p1.setProductName("iPhone 15 pro max");
//		p1.setProductPrice(150000);
//		
//		productDetailsRepository.save(p1);
//	}
	
	public void deleteProduct() {
		productDetailsRepository.deleteAll();
	}
	
	//add user information
	
	public void addUserInformation() {
		UserInformation user = new UserInformation();
		user.setUserId(1124);
		user.setUserName("Sri");
		user.setContact("8870177888");
		
		userDetailsRepo.save(user);
		
	}
	
}
