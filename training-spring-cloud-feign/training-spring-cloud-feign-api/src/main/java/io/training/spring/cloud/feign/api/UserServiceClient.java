package io.training.spring.cloud.feign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("training-spring-cloud-feign-provider")
public interface UserServiceClient {
	@RequestMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") String id);
	@RequestMapping("/createUser")
	public String create(@RequestBody User user);
	
}
