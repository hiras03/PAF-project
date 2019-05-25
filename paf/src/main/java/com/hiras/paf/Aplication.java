package com.hiras.paf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class Aplication {

	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
		// TODO Auto-generated method stub

	}

}
