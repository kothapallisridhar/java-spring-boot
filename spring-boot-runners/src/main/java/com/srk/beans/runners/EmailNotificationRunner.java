package com.srk.beans.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class EmailNotificationRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\nArgs in EmailNotificationRunner: " + args.length);
		for(String arg: args) {
			System.out.println(arg);
		}
		
		System.out.println("\nSending Email to developer team...");
		System.out.println("Email sent successfully...\n");
		
	}

}
