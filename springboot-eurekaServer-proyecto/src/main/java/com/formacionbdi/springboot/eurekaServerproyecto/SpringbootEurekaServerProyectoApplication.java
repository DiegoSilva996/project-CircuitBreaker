package com.formacionbdi.springboot.eurekaServerproyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringbootEurekaServerProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaServerProyectoApplication.class, args);
	}

}
