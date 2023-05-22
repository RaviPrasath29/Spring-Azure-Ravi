package com.mayravi.azure.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureRaviApplication {
	
	@GetMapping("message")
	public String message() {
		return "Ravi prasath created web app";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureRaviApplication.class, args);
	}

}
