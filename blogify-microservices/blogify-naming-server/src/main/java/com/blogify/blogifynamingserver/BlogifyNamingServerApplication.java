package com.blogify.blogifynamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BlogifyNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogifyNamingServerApplication.class, args);
	}

}
