package com.magic.tower.game.com;

public class ResponseBodyError {

	private String errorCode;
	private String errorMessage;
	private String parameterName;

	public ResponseBodyError() {
	}
	
	public ResponseBodyError(String errorCode, String errorMessage, String parameterName) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.parameterName = parameterName;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

}
