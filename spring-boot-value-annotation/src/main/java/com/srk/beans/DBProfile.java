package com.srk.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("production")
public class DBProfile {
	
	@Value("${db.port.number}")
	String dbPassword;

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	

}
