package com.rams.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class TestResourceNotFoundException  extends RuntimeException {

	public TestResourceNotFoundException(String message ) {
		super(message);
	}

}
