package com.example.demo;

import java.io.ObjectInputFilter.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	
		 Theatre th = context.getBean(Theatre.class);
		 th.watch();
	}

}
