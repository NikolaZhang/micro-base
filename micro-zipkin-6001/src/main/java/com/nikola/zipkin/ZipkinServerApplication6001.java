package com.nikola.zipkin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableZipkinServer
public class ZipkinServerApplication6001 {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(ZipkinServerApplication6001.class).web(true).run(args);
	}

}
