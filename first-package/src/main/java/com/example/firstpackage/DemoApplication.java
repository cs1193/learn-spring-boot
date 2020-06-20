package com.example.firstpackage;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import org.springframework.boot.builder.SpringApplicationBuilder;
// import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.context.annotation.Bean;

import org.springframework.web.client.RestTemplate;

@SpringBootApplication
// @RestController
// public class DemoApplication extends SpringBootServletInitializer {
public class DemoApplication {

  @Autowired
  RestTemplate restTemplate;

  // @Override
  // protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
  //   return application.sources(DemoApplication.class);
  // }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

  // @RequestMapping(value = "/")
  // public String hello() {
  //   return "Hello World";
  // }

  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
