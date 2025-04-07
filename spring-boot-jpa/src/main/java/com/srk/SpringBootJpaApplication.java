package com.srk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srk.operations.DatabaseOperations;
import com.srk.operations.DatabaseOperationsTwo;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaApplication.class, args);
		
		DatabaseOperations dbOperations = (DatabaseOperations)container.getBean(DatabaseOperations.class);
		//dbOperations.addProductInformation();
		dbOperations.addUserInformation();
		dbOperations.deleteProduct();
	
		DatabaseOperationsTwo dbOperationsTwo = container.getBean(DatabaseOperationsTwo.class);
		dbOperationsTwo.addMoreProducts();
	}

}
