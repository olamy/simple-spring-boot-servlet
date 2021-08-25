package org.eclipse.jetty.test.simplespringbootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringBootServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootServletApplication.class, args);
	}

}
