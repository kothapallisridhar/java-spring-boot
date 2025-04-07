package com.srk.beans.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class PushNotification implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Args in PushNotification: " + args.length);
		for(String arg: args) {
			System.out.println(arg);
		}
		
		System.out.println("\nSending Push Notification to Business Team...");
		System.out.println("Push Notification sent successfully...\n");
		
	}

}
