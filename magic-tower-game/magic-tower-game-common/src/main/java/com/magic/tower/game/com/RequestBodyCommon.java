package com.magic.tower.game.com;

import java.io.Serializable;

public class RequestBodyCommon implements Serializable {

	private static final long serialVersionUID = 4776108186914146855L;

	private String serialNumber;

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
