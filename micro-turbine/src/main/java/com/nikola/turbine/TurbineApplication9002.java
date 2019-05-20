package com.nikola.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableTurbine
public class TurbineApplication9002 {
	public static void main(String[] args) {
		SpringApplication.run(TurbineApplication9002.class, args);
	}
}
