package com.example.StudentApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.example"})
@EntityScan("com.example*")
@EnableJpaRepositories("com.example*")
public class StudentApplication2 {
	
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication2.class, args);
	}

}
