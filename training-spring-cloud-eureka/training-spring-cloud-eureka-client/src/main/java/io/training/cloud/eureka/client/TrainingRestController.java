package io.training.cloud.eureka.client;

//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class TrainingRestController {

	// private DiscoveryClient client;

	@RequestMapping("/test")
	public String test(String name) {
		// ServiceInstance instance = client.getLocalServiceInstance();
		// log.info("/test, host:{}, serviceId:{}", instance.getHost(),
		// instance.getServiceId());
		return "Hello: " + name;
	}
}
