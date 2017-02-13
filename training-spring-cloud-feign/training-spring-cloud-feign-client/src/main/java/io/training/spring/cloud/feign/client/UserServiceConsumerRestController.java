package io.training.spring.cloud.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.training.spring.cloud.feign.api.User;
import io.training.spring.cloud.feign.api.UserServiceClient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserServiceConsumerRestController {

	@Autowired
	private UserServiceClient userServiceClient;

	@RequestMapping("/getUser/{id}")
	public User consumer(@PathVariable("id") String id) {
		return userServiceClient.getUser(id);
	}

	@RequestMapping("/create")
	public String create() {
		User user = new User();
		user.setId("001");
		user.setName("User001");
		log.info("Client:#####################{}", user);
		return userServiceClient.create(user);
	}
}
