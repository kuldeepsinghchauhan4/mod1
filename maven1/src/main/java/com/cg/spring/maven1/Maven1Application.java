package com.cg.spring.maven1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg")
@EntityScan("com.cg.springmvc.bean")
public class Maven1Application {

	public static void main(String[] args) {
		SpringApplication.run(Maven1Application.class, args);
	}

}
