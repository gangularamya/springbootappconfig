package com.example.appconfigsampleJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class AppconfigsampleJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppconfigsampleJavaApplication.class, args);
	}

}
