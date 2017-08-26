package com.darkhorse.rest.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 引导服务入口。
 * 
 * @author hzcgw
 *
 */
@SpringBootApplication
public class RestBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(RestBootstrap.class, args);
	}
}