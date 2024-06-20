package com.cbamz.business_management_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// Remove this later once we set up the dev DB.
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BusinessManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessManagementApiApplication.class, args);
	}

}
