package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.ServiceConsumerController;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackageClasses=ServiceConsumerController.class)
public class ServiceconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceconsumerApplication.class, args);
	}
}
