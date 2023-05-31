package org.studyeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
@ComponentScan({ "org.studyeasy.DaoImpl", "org.studyeasy.BrandServiceImpl", "org.studyeasy.controller",
		"org.studyeasy.repository", "org.studyeasy.DaoImpl" })
public class SpringBatchTesting2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchTesting2Application.class, args);
	}

}
