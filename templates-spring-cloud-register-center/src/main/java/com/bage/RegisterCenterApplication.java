package com.bage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RegisterCenterApplication.class, args);
	}

}