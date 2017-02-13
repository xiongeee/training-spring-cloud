package io.training.spring.cloud.feign.api;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
	private String id;
	private String name;
}
