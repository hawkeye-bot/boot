package com.cgi.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {
	//Perform a POST on http://localhost:8080/shutdown to stop the application
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}