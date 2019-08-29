package com.magic.tower.game.com;

public class EntityResponseBody extends EntityBody {

	private static final long serialVersionUID = -8862824138007678484L;

	private ResponseBodyCommon common;

	public EntityResponseBody() {
		this.common = new ResponseBodyCommon();
	}

	public ResponseBodyCommon getCommon() {
		return common;
	}

	public void setCommon(ResponseBodyCommon common) {
		this.common = common;
	}

	public final void setSerialNumber(String serialNumber) {
		common.setSerialNumber(serialNumber);
	}

}
