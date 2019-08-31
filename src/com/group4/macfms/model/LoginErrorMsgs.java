package com.group4.macfms.model;

public class LoginErrorMsgs {
	
	private String commonerrorMsg;
	private String usernameError;
	private String passwordError;
	private String noDataError;
	
	public LoginErrorMsgs(String commonerrorMsg, String usernameError, String passwordError, String noDataError) {
		super();
		this.commonerrorMsg = commonerrorMsg;
		this.usernameError = usernameError;
		this.passwordError = passwordError;
		this.noDataError = noDataError;
	}
	
	public String getCommonerrorMsg() {
		return commonerrorMsg;
	}
	public void setCommonerrorMsg(String commonerrorMsg) {
		this.commonerrorMsg = commonerrorMsg;
	}
	public String getUsernameError() {
		return usernameError;
	}
	public void setUsernameError(String usernameError) {
		this.usernameError = usernameError;
	}
	public String getPasswordError() {
		return passwordError;
	}
	public void setPasswordError(String passwordError) {
		this.passwordError = passwordError;
	}
	public String getNoDataError() {
		return noDataError;
	}
	public void setNoDataError(String noDataError) {
		this.noDataError = noDataError;
	}

}
