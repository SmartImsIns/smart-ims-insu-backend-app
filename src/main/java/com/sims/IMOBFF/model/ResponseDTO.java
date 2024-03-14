package com.sims.IMOBFF.model;

import org.springframework.http.HttpStatus;

public class ResponseDTO {
	
	private Object data;
	private HttpStatus statusCode;
	private String message= "";
	
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public HttpStatus getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ResponseDTO [data=" + data + ", statusCode=" + statusCode + ", message=" + message + "]";
	}
	

}
