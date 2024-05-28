package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class ExceptionHandler {
     @org.springframework.web.bind.annotation.ExceptionHandler(PriceException.class)
	public ResponseEntity<Object>handle(PriceException p) {
		return new ResponseEntity<>("posting the data price>400000 ",HttpStatus.BAD_REQUEST);
	}
	

}
