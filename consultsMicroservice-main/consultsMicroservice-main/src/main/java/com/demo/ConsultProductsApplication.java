package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConsultProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultProductsApplication.class, args);
	}

}
