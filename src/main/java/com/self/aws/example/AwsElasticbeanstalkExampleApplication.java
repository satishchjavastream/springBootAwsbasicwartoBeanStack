package com.self.aws.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsElasticbeanstalkExampleApplication {

	@GetMapping("/status")
	public String deploy(){
		return "Application deployed to AWS beanstalk...";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsElasticbeanstalkExampleApplication.class, args);
	}

}
