package io.training.spring.cloud.feign.server;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.training.spring.cloud.feign.api.User;
import io.training.spring.cloud.feign.api.UserServiceClient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserServiceRestController implements UserServiceClient {

	@Override
	public User getUser(@PathVariable("id") String id) {
		User u = new User();
		u.setId(id);
		u.setName("User:" + id);
		return u;
	}

	@Override
	public String create(@RequestBody User user) {
		log.info("Provider:=================={}", user);
		return user.getId();
	}

}
