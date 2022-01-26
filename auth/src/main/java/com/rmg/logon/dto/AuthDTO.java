package com.rmg.logon.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class AuthDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8530807056786182156L;
	private String username;
	private String password;
	
}
