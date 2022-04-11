package com.nhuallpa.marvelgateway;

import com.nhuallpa.marvelgateway.config.UrlConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(UrlConfiguration.class)
public class MarvelGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelGatewayApplication.class, args);
	}


}
