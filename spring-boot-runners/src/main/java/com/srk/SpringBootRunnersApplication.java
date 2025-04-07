package com.srk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srk.beans.Product;

@SpringBootApplication
public class SpringBootRunnersApplication {

	public static void main(String[] args) {
		
		System.out.println("Args size: " + args.length);
		for(String arg: args) {
			System.out.println(arg);
		}
		
		System.out.println("*** Before run method ***");
		ConfigurableApplicationContext container =  SpringApplication.run(SpringBootRunnersApplication.class, args);
		System.out.println("*** After run method completed ***");
		
		System.out.println("*** Spring Boot Application Started ***\n");
		
		Product product = (Product)container.getBean(Product.class);
		System.out.println(product);
	}

}
