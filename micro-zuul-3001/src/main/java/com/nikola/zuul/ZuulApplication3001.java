package com.nikola.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication3001 {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication3001.class, args);
	}
}
