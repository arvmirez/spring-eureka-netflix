package com.arvmirez.springeurekanetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaNetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaNetflixApplication.class, args);
	}

}
