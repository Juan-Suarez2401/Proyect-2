package com.proyecto.springboot.app.conevnio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioConvenioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioConvenioApplication.class, args);
	}

}
