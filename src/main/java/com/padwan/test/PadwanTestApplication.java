package com.padwan.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.padwan.test.model")
public class PadwanTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadwanTestApplication.class, args);
	}

}
