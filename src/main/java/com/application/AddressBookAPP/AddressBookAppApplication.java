package com.application.AddressBookAPP;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;


/**
 * @SpringBootApplication : Spring boot main application class.
 */
@Slf4j
@SpringBootApplication
public class AddressBookAppApplication {
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AddressBookAppApplication.class, args);
		log.info("Address Book Application Started {} in Environment",context.getEnvironment().getProperty("environment"));
	}
}