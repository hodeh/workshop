package io.pivotal.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigServiceDemoApplication {

	@Value("${greeting.message}")
	private String greetingMessage;

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceDemoApplication.class, args);
	}

	@GetMapping("/greeting")
	public String getGreetingMessage() {
		return greetingMessage;
	}
}
