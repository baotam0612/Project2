package com.javaweb.model;

import java.util.ArrayList;

public class ErrorReponseDTO {
	private String error;
	private ArrayList<String> details = new ArrayList<String>();
	public String getError() {
		return error;
	}
	public ArrayList<String> getDetails() {
		return details;
	}
	public void setError(String error) {
		this.error = error;
	}
	public void setDetail(ArrayList<String> detail) {
		this.details = detail;
	}
}
