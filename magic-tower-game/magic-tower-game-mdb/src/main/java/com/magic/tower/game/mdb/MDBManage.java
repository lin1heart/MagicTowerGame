package com.magic.tower.game.mdb;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;

@Component
public class MDBManage implements DisposableBean {

	@Autowired
	protected MongoClient mongo;
	@Autowired
	protected MongoConverter mappingMongoConverter;

	private final ScheduledExecutorService thread;

	@Autowired
	public MDBManage(@Value("${service.threads.mdb.maintenance:1}") int threads) {
		thread = Executors.newScheduledThreadPool(threads);
	}

	public ScheduledFuture<?> schedule(Runnable runnable, long period) {
		return thread.scheduleAtFixedRate(runnable, period, period, TimeUnit.MILLISECONDS);
	}

// TODO try to get from existing bean
	public MDB getMDB(String database) {
		return new MDB(mongo, database);
	}

// TODO try to get from existing bean
	public MDBTemplate getMDBTemplate(String database) {
		return new MDBTemplate(new SimpleMongoDbFactory(mongo, database), mappingMongoConverter);
	}

	public void destroy() throws Exception {
		thread.shutdown();
	}

}
