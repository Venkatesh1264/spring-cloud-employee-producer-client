package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//This commit is for new branch
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEmployeeProducerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEmployeeProducerClientApplication.class, args);
	}

}
