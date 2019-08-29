package com.magic.tower.game.com;

public class EntityRequestBody extends EntityBody {

	private static final long serialVersionUID = -285340078646660692L;

	private RequestBodyCommon common;

	public EntityRequestBody() {
		this.common = new RequestBodyCommon();
	}

	public RequestBodyCommon getCommon() {
		return common;
	}

	@Deprecated
	public void setCommon(RequestBodyCommon common) {
		this.common = common;
	}

	public final void setSerialNumber(String serialNumber) {
		common.setSerialNumber(serialNumber);
	}

}
