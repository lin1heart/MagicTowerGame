package com.magic.tower.game.com;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class ResponseBodyCommon implements Serializable {

	private static final long serialVersionUID = 2214985537431588688L;

	private String serialNumber;
	private String returnCode;
	private String returnMessage;
	private List<ResponseBodyError> error;

	public ResponseBodyCommon() {
		this.returnCode = ReturnCodeCategory.SUCCESS.getCode();
		this.returnMessage = "成功";
		this.error = new ArrayList<ResponseBodyError>();
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public List<ResponseBodyError> getError() {
		return error;
	}

	@Deprecated
	public void setError(List<ResponseBodyError> error) {
		this.error = error;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

}
