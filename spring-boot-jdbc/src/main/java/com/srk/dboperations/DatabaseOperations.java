package com.srk.dboperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseOperations {

	//Req: adding product details to product tables
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addProduct() {
		
		// DML : Data Manipulation Language : DML queries
		String query = "INSERT INTO PRODUCT values(105,'SamsungS25ultra',160000)";
		jdbcTemplate.update(query);
	}
	
	public void deleteProduct() {
		
		String query = "DELETE FROM PRODUCT WHERE pid=102";
		int noOfRecDeleted = jdbcTemplate.update(query);
		System.out.println("Total records deleted: " + noOfRecDeleted);
	}
}
