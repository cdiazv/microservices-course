package org.deerme.java.example.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)

public class PetServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public PetServiceException() {

	}

	public PetServiceException(String message) {
		super(message);

	}

	public PetServiceException(Throwable ex) {
		super(ex);

	}

	public PetServiceException(String message, Throwable ex) {
		super(message, ex);
	}

}
