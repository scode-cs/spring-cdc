package com.scode;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Spring Cloud Contract API", version = "1.0",
		description = "API for Cloud Contract"))
@SpringBootApplication
public class SpringCdcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCdcApplication.class, args);
	}

}
