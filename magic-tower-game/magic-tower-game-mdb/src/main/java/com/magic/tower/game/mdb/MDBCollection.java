package com.magic.tower.game.mdb;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.util.StringUtils;

public class MDBCollection {

	public static final String ID = "_id";

	public static String name(String... names) {
		return StringUtils.arrayToDelimitedString(names, ".");
	}

	@Id
	private ObjectId id;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

}
