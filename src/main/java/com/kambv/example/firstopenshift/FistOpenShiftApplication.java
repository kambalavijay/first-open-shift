package com.kambv.example.firstopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableJpaRepositories(basePackages = "com.kambv.example.firstopenshift.db.repository")
@SpringBootApplication
class FistOpenShiftApplication {

	public static void main(String[] args) {

		SpringApplication.run(FistOpenShiftApplication.class, args);
	}

}
