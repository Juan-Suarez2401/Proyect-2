package com.superflex.springboot.app.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SuperFelxServicioUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperFelxServicioUsuarioApplication.class, args);
	}

}
