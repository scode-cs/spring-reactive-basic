package com.scode.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.scode.reactive")
@SpringBootApplication
public class SpringReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveApplication.class, args);
	}

}
