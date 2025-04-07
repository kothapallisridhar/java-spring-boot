package com.srk.dboperations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductsManagement {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void saveProducts() {
		
		String query = "INSERT INTO PRODUCT values(?,?,?)";
		jdbcTemplate.update(query, 111, "Samsung Galaxy S23", 110000);
	}
	
	// select query:
	
	// load Products information : Product
	// Query: select * from products;
	
	public void loadAllProducts() {
		String query = "select * FROM PRODUCT";
		List<ProductDetails> allProducts = jdbcTemplate.query(query, new BeanPropertyRowMapper<ProductDetails>(ProductDetails.class));
		
		allProducts.forEach(product -> {
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getPrice());
			System.out.println();
		});
		
	}

}
