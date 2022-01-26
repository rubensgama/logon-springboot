package com.rmg.logon.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.rmg.logon.dto.UserDTO;
import com.rmg.logon.exception.AuthException;

@Service
public class UserService {
	public UserDTO findByNameAndPassword(String name, String password) {
		//this a mocked code. it must call a spring data repository.
		return new UserDTO("rubensgama", UUID.randomUUID().toString());
	}

	public UserDTO signIn(String username, String password) {
		if (ObjectUtils.isEmpty(username) || ObjectUtils.isEmpty(password)) {
			throw new AuthException("Username/password is required.");
		}
		UserDTO user = this.findByNameAndPassword(username, password);
		if (user == null) {
			throw new AuthException("User not found.");
		}
		return user;
	}
}
