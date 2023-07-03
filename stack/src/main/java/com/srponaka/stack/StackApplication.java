package com.srponaka.stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StackApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackApplication.class, args);
		StackUsingArray s= new StackUsingArray(4);
		s.push(2);
		s.push(6);
		s.push(7);
		s.push(8);
		boolean isFull=s.isFull();
		System.err.println(isFull);
	}

}
