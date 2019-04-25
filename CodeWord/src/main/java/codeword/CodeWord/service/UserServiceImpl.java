package codeword.CodeWord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codeword.CodeWord.Entity.User;
import codeword.CodeWord.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepository;
	
	@Override
	public User findUserbyID(String Id) {
		return userRepository.findUserbyID(Id);
	}
	
	@Override
	public User findUserbyUserName(String userName) {
		return userRepository.findUserbyUserName(userName);
	}
	
	@Override
	public String createUser(User user) {
		return userRepository.createUser(user);
	}
	

}
