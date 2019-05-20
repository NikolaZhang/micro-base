package com.nikola.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication5001 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication5001.class, args);
	}
}
