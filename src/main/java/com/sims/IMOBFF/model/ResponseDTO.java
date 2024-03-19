package com.sims.IMOBFF.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseDTO<T> {
	
	private T data;
	private Integer statusCode;
	private String message= "";
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
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
