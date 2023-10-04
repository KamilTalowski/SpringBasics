package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DemoSpringBootApplication.class, args);
		
		Person p = context.getBean(Person.class);
		p.show();
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void get() {
		System.out.println("Hello event listener");
	}

}
