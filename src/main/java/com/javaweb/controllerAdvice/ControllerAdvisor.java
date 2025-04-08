package com.javaweb.controllerAdvice;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.javaweb.model.ErrorReponseDTO;

import customexception.FieldRequireException;
@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<Object> handleArithmeticException(ArithmeticException ex, WebRequest request) {
		ErrorReponseDTO errorReponseDTO = new ErrorReponseDTO();
		errorReponseDTO.setError(ex.getMessage());
		ArrayList<String> details = new ArrayList<>();
		details.add("so nguyen lam sao chia duoc cho 0");
		errorReponseDTO.setDetail(details);

		return new ResponseEntity<>(errorReponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(FieldRequireException.class)
	public ResponseEntity<Object> handleFieldRequireException(FieldRequireException ex, WebRequest request) {
		ErrorReponseDTO errorReponseDTO = new ErrorReponseDTO();
		errorReponseDTO.setError(ex.getMessage());
		ArrayList<String> details = new ArrayList<>();
		details.add("number hoac numberofBasement co gia tri bang null");
		errorReponseDTO.setDetail(details);
		return new ResponseEntity<>(errorReponseDTO, HttpStatus.BAD_GATEWAY);
	}
}
