package com.srk.beans.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class TextMessageNotification implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String[] values = args.getSourceArgs();
		
		System.out.println("Args in TextMessageNotification: " + values.length);
		
		for(String arg: values) {
			System.out.println(arg);
		}
		
		System.out.println("\nSending Text Message to management...");
		System.out.println("Text Message sent successfully...\n");
		
	}

}
