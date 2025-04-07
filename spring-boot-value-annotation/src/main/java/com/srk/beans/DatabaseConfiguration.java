package com.srk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfiguration {
	
	@Value("${db.port.number}")
	private int port;
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String userName;
	@Value("${db.password}")
	private String password;
	@Value("${spring.application.name}")
	private String appName;
	
	
	@Autowired
	private DBProfile dbProfile; // injection of reference of other bean object
	
	
	public DatabaseConfiguration() {
		System.out.println("DB is created...");
	}
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public DBProfile getDbProfile() {
		return dbProfile;
	}

	public void setDbProfile(DBProfile dbProfile) {
		this.dbProfile = dbProfile;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	

}
