package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan; // is this needed?

@ServletComponentScan
@SpringBootApplication
public class TheNibbloniansApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheNibbloniansApplication.class, args);
	}

}

