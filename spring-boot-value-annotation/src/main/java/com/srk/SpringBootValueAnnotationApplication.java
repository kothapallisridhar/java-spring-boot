package com.srk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.srk.beans.AwsDatabaseConfiguration;
import com.srk.beans.DatabaseConfiguration;
import com.srk.beans.EmailsCredentialsConfiguration;
import com.srk.beans.org.OrganizationInfo;

@PropertySource(value={"aws-database.properties"})
@SpringBootApplication
public class SpringBootValueAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =  SpringApplication.run(SpringBootValueAnnotationApplication.class, args);
		DatabaseConfiguration dbConfig =  (DatabaseConfiguration)container.getBean("databaseConfiguration");
		System.out.println(dbConfig.getPort());
		System.out.println(dbConfig.getUrl());
		System.out.println(dbConfig.getUserName());
		System.out.println(dbConfig.getPassword());
		
		System.out.println(dbConfig.getDbProfile().getDbPassword());
		
		System.out.println(dbConfig.getAppName());
		
		System.out.println("******** Email Data *********");
		
		EmailsCredentialsConfiguration emailData =  (EmailsCredentialsConfiguration)container.getBean("emailCredentials");
		System.out.println(emailData.getEmailHost());
		System.out.println(emailData.getEmailId());
		System.out.println(emailData.getEmailPassword());
		
		System.out.println("********* Org Data **********");
		OrganizationInfo orgInfo = (OrganizationInfo)container.getBean("organizationInfo");
		System.out.println(orgInfo.getOrgEmpCount());
		System.out.println(orgInfo.getDeptNames());
		orgInfo.getDeptNames().forEach(System.out::println);
		
		System.out.println("********* AWS Database Check **********");
		AwsDatabaseConfiguration awsDb = (AwsDatabaseConfiguration)container.getBean("awsDatabaseConfiguration");
		System.out.println(awsDb.getAwsHost());
		System.out.println(awsDb.getAwsUserName());
		System.out.println(awsDb.getAwsPassword());
		
		
		
	}

}
