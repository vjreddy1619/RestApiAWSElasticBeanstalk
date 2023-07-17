package com.vjreddy.aws.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApiAwsElasticBeanstalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiAwsElasticBeanstalkApplication.class, args);
	}
	@GetMapping("/wishing")
	public String greetings() {
		return "Welcome to Aws Elastic bean stalk";
	}

}
