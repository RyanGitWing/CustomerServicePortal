package ca.carleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerPortalApplication {
	private static final Logger log = LoggerFactory.getLogger(ca.carleton.CustomerPortalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ca.carleton.CustomerPortalApplication.class, args);
	}

}