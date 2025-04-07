package com.srk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.srk.beans.Order;
import com.srk.beans.Product;

@SpringBootApplication
public class SpringBeanScopesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =  SpringApplication.run(SpringBeanScopesApplication.class, args);
		
		Product p1 = (Product) container.getBean("product");
		System.out.println(p1);
		
		Product p2 = (Product) container.getBean("product");
		System.out.println(p2);
		
		Order order1 = (Order) container.getBean("order");
		System.out.println(order1);

		Order order2 = (Order) container.getBean("order");
		System.out.println(order2);
		
		System.out.println(order1.getProduct());
		System.out.println(order2.getProduct());
		
		System.out.println("******* 2nd product ********");
		
		Product p3 = (Product) container.getBean("product2");
		System.out.println(p3);
		Product p4 = (Product) container.getBean("product2");
		System.out.println(p4);
		
	}
	
	@Scope("prototype")
	@Bean
	Product product2() {
		return new Product();
	}

}
