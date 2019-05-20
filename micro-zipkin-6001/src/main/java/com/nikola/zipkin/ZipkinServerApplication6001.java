package com.nikola.zipkin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableZipkinServer
public class ZipkinServerApplication6001 {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(ZipkinServerApplication6001.class).web(true).run(args);
	}

}
