package codeword.CodeWord.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import codeword.CodeWord.Entity.User;

@Repository
public class UserRepoImpl implements UserRepo {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<User> findAllUser(){
//		TODO: Need to implement allUser info
		List<User> allUser = null;
		return allUser;
	}

	@Override
	public User findUserbyID(String Id) {
		return em.find(User.class, Id);
	}
	
	@Override
	public User findUserbyUserName(String userName) {
		return em.find(User.class, userName);
	}
	
	@Override
	public String createUser(User user) {
		em.persist(user);
		return "User_created";
	}
	
	
	
	
	
	
	

}
