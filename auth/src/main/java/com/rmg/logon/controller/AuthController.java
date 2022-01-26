/**
 * 
 */
package com.rmg.logon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmg.logon.dto.AuthDTO;
import com.rmg.logon.dto.UserDTO;
import com.rmg.logon.service.UserService;

/**
 * @author rubensgama
 *
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private UserService userService;
	
	@PostMapping
	public UserDTO authenticate(@RequestBody AuthDTO dto) {
		return this.userService.signIn(dto.getUsername(), dto.getPassword());
	}
}
