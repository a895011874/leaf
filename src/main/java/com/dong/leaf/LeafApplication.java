package com.dong.leaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.dong.leaf.model")
@SpringBootApplication
public class LeafApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeafApplication.class, args);
	}
}
