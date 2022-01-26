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
public class UserDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3889080685062023038L;
	private String username;
	private String token;
}
