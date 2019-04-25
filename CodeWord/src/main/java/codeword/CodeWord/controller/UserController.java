package codeword.CodeWord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import codeword.CodeWord.Entity.User;
import codeword.CodeWord.service.UserService;

@RestController
@RequestMapping(path="user")
public class UserController {
	
	@Autowired
	UserService userServe;
	
	@RequestMapping(method = RequestMethod.GET, path = "/id/{userID}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User getUserbyID(@PathVariable("userID") String userID) {
		return userServe.findUserbyID(userID);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/user/{userName}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User getUserbyUserName(@PathVariable("userName") String userName) {
		return userServe.findUserbyUserName(userName);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "createUser", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String createUser(@RequestBody User user) {
		return userServe.createUser(user);
	}

}
