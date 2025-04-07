package com.srk.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.srk.lms.app.Product;

//@ComponentScan("com")
//@SpringBootApplication(scanBasePackages= {"com.xyz", "com.srk.lms"})
@SpringBootApplication
public class SrkappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SrkappApplication.class, args);
		Object obj = container.getBean("student");
		Student s = (Student)obj;
		System.out.println(s);
		
		System.out.println((Student)container.getBean("student2"));
	}
	
	@Bean
	public Student student2() {
		System.out.println("Student2 bean creating");
		return new Student();
	}
	
	@Bean
	public Product product3() {
		System.out.println("Product3 bean creating");
		return new Product();
	}

}
