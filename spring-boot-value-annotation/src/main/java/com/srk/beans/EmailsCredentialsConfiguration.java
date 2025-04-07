package com.srk.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailCredentials")
public class EmailsCredentialsConfiguration {
	
	//@Value("${app.email.host}")
	private String emailHost;
	
	@Value("${app.email.user}")
	private String emailId;
	
//	public EmailsCredentialsConfiguration() {
//		System.out.println("default constructor is called");
//	}

	public EmailsCredentialsConfiguration(@Value("${app.email.host}") String emailHost) {
		System.out.println("1 param constructor is called: " + emailHost);
		this.emailHost = emailHost;
	}

	//@Value("${app.email.password}")
	private String emailPassword;

	public String getEmailHost() {
		return emailHost;
	}

	public void setEmailHost(String emailHost) {
		this.emailHost = emailHost;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmailPassword() {
		return emailPassword;
	}

	@Value("${app.email.password}") 
	public void setEmailPassword(String emailPassword) {
		System.out.println("setEmailPassword is called and injected value: " + emailPassword);
		this.emailPassword = emailPassword;
	}
	
	

}
