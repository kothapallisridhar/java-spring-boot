package com.srk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srk.database.DataBaseConnection;
import com.srk.database.EmailConnection;

@SpringBootApplication
public class SpringBeanLifeCycleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBeanLifeCycleApplication.class, args);
		
		System.out.println("In Utilization state...");
		 DataBaseConnection dataBaseConnection = (DataBaseConnection)container.getBean("dataBaseConnection");
		 System.out.println("Utilizing Bean: " + dataBaseConnection);
		 DataBaseConnection dataBaseConnection2 = (DataBaseConnection)container.getBean("dataBaseConnection");
		 System.out.println("Utilizing Bean: " + dataBaseConnection2);
		 
		 // Email : Annotations
		 EmailConnection  emailConnection = (EmailConnection)container.getBean("emailConnection");
		 EmailConnection  emailConnection2 = (EmailConnection)container.getBean("emailConnection");
	}

}
