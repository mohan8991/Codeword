package codeword.CodeWord.repository;

import codeword.CodeWord.Entity.User;

public interface UserRepo {

	//	public List<User> findAllUser(){
	////		TODO: Need to implement allUser info
	//		List<User> alluser;
	//		return alluser;
	//	}
	//	
	User findUserbyID(String Id);

	User findUserbyUserName(String userName);

	String createUser(User user);

}