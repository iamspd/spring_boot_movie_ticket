package com.booking.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
* @author Priyank
* Name: Priyank Shah
* Student #: 301097375
* Submission Date: Nov 13, 2020
*/

@SpringBootApplication
@ComponentScan({"com.movie", "com.ticket"})
public class PriyankComp303Assignment3Application {

	public static void main(String[] args) {
		SpringApplication.run(PriyankComp303Assignment3Application.class, args);
		
		System.out.println("REST Web service for -- Movie -- has started...");
		
		System.out.println("REST Web service for -- Ticket -- has started...");

	}

}
