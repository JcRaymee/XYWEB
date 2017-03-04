package com;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class XywebApplication {

	private static Logger logger = Logger.getLogger(XywebApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(XywebApplication.class, args);
	}
}
