package com.example.anglogin.response;

public class LoginResponse {
	
	private String message;
    private Boolean status;
    
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public LoginResponse(String message, Boolean status) {
		
		super();
		this.message = message;
		this.status = status;
	}
    
    

}
