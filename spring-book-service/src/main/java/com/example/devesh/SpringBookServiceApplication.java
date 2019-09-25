package com.example.devesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookServiceApplication.class, args);
	}

}
