package com.srk.database;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Scope("singleton")
@Component
public class EmailConnection {
	
	public EmailConnection() {
		System.out.println("Email Created...");
		
	}
	
	@PostConstruct
	public void logicBeanCreation() {
		System.out.println("This is life cycle method : After Construction and Configuration");
	}
	
	@PreDestroy
	public void logicBeanDestruction() {
		System.out.println("This is life cycle method : Before Destruction");
	}
	
	public void email2LifeCycle() {
		System.out.println("email2LifeCycle method...");
	}
	
	public void email2LifeCycleDestroy() {
		System.out.println("email2LifeCycleDestroy method...");
	}

}
