package com.kambv.example.fistopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FistOpenShiftApplication {

	@GetMapping("/")
	public String welcome(){
		return "Welcome";
	}

	@GetMapping("/{user}")
	public String welcomeUser(@PathVariable String user){
		return "Welcome " + user;
	}

	public static void main(String[] args) {

		SpringApplication.run(FistOpenShiftApplication.class, args);
	}

}
