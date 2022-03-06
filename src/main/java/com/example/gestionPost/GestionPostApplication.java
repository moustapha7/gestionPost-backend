package com.example.gestionPost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class GestionPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionPostApplication.class, args);
	}

}
