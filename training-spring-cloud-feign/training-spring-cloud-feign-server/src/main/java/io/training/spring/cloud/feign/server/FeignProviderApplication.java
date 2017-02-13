package io.training.spring.cloud.feign.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class FeignProviderApplication {

	public static void main(String[] args) {
		// SpringApplication.run(FeignProviderApplication.class, args);
		new SpringApplicationBuilder(FeignProviderApplication.class).web(true).run(args);
	}

}
