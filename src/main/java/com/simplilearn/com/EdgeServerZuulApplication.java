package com.simplilearn.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EdgeServerZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServerZuulApplication.class, args);
	}

}
