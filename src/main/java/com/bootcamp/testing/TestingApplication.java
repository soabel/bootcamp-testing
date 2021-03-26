package com.bootcamp.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
		
		var calculadora = new Calculadora();
		
		var resultado = calculadora.sumar(4,3);

		System.out.println("resultado = " + resultado);
		
	}

}
