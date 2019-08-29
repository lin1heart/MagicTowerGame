package com.magic.tower.game.mdb;

import com.mongodb.DB;
import com.mongodb.Mongo;

public class MDB extends DB {

	protected MDB(Mongo mongo, String name) {
		super(mongo, name);
	}

}
