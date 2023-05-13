package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HostBuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HostBuddyApplication.class, args);
		System.out.println("Running");
	}

}
