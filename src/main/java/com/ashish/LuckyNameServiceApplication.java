package com.ashish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan("com")
public class LuckyNameServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuckyNameServiceApplication.class, args);
	}
//comment
}
