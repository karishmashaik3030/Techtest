package com.bank.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bank.model.User;
import com.bank.bank.repository.UserRepository;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;
	public User insertUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
