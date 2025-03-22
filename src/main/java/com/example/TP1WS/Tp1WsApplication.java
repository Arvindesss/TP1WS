package com.example.TP1WS;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "TP1 WS",
				description = "TP1 endpoints and apis",
				version = "1.0.0"
		)
)
public class Tp1WsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1WsApplication.class, args);
	}

}
