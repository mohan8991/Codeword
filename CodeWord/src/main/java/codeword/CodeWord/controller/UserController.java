package codeword.CodeWord.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import codeword.CodeWord.UserEntity.User;

@RestController
public class UserController {
	
	@RequestMapping("/user")
	public User getUser(@RequestParam(value="name", defaultValue="world") String Name) {
		return new User();
	}

}
