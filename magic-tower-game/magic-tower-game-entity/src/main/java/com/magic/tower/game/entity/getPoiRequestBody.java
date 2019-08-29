package com.magic.tower.game.entity;

import com.magic.tower.game.com.EntityRequestBody;

/**
 * 获取
 * @author lin1heart
 *
 */
public class getPoiRequestBody extends EntityRequestBody{
	
	private static final long serialVersionUID = 1L;
	
	private Double latitude;
	private Double longitude;
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}
