package com.rmg.logon.exception;

public class AuthException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7671831211225038654L;

	/**
	 * 
	 */
	public AuthException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public AuthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AuthException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public AuthException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AuthException(Throwable cause) {
		super(cause);
	}
}
