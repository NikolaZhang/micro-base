package com.nikola.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashApplication9001 {
	
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashApplication9001.class, args);
	}
}
