package com.magic.tower.game.entity;

import com.magic.tower.game.com.EntityResponseBody;

public class getPoiResponseBody extends EntityResponseBody{

	private static final long serialVersionUID = 1L;
	
	private getPoiResponseBodyData payload;

	public getPoiResponseBodyData getPayload() {
		return payload;
	}

	public void setPayload(getPoiResponseBodyData payload) {
		this.payload = payload;
	}

}
