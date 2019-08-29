package com.magic.tower.game.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.magic.tower.game.entity.getPoiRequestBody;
import com.magic.tower.game.entity.getPoiResponseBody;
import com.magic.tower.game.entity.getPoiResponseBodyData;
import com.magic.tower.game.utils.MathUtils;

@Controller
@RequestMapping("/api")
public class BioSystem {

	private static final Logger LOG = LoggerFactory.getLogger(BioSystem.class);
//	private static double EAST = 121.8150900000;
	private static double SOUTH = 30.8682660000;
	private static double WEAT = 121.3468170000;
//	private static double NORTH = 31.3889780000;
	private static long eastAndWeat = 44000;
	private static long southAndNorth = 58000;
	private static long LONG = 100000000;
	
	
	@RequestMapping(path = "/pos", method = RequestMethod.GET)
	@ResponseBody
	public getPoiResponseBody getPos(getPoiRequestBody request,getPoiResponseBody response) {
		LOG.debug("获取坐标地址开始");
		response.setSerialNumber(request.getCommon().getSerialNumber());
		Double lat = request.getLatitude();
		Double lon = request.getLongitude();
		Double y = MathUtils.div(MathUtils.mul(MathUtils.sub(lat, SOUTH), LONG),southAndNorth);
		Double x = MathUtils.div(MathUtils.mul(MathUtils.sub(lon, WEAT), LONG),eastAndWeat);
		getPoiResponseBodyData resData = new getPoiResponseBodyData();
		resData.setX(x.intValue());
		resData.setY(y.intValue());
		response.setPayload(resData);
		LOG.debug("获取坐标地址结束");
		return response;
	}
}
