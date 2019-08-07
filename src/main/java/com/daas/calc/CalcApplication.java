package com.daas.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.daas.calc.controller","com.daas.calc.service"})
public class CalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);
	}

}
