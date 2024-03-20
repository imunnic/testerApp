package com.imunnic.testerApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class TesterAppApplication {

    private static final Logger log = LoggerFactory.getLogger(TesterAppApplication.class);
  
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TesterAppApplication.class, args);
		
		System.err.println("Está todo correcto");
		log.debug("Working");
		
	}

}
