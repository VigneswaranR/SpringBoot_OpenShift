package com.TCSNGA.MS1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class TcsNgaMS1Application {

	public static void main(String[] args) {
		SpringApplication.run(TcsNgaMS1Application.class, args);
	}
}
