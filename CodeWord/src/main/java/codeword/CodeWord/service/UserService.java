package codeword.CodeWord.service;

import codeword.CodeWord.Entity.User;

public interface UserService {

	User findUserbyID(String Id);

	User findUserbyUserName(String userName);

	String createUser(User user);

}