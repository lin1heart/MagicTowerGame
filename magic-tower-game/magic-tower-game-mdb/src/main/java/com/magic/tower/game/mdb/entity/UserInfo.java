package com.magic.tower.game.mdb.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 人物信息表
 * @author linyunzhe
 *
 */
@Document(collection = UserInfo.COLLECTION_NAME)
public class UserInfo {
	
	public static final String COLLECTION_NAME = "user_info";
	
	@Id
	private ObjectId id;
	/**
	 * 用户id
	 */
	@Field
	private String userId;
	/**
	 * 等级
	 */
	@Field
	private Integer level;
	/**
	 * 角色id
	 */
	@Field
	private String roleId;
	/**
	 * 属性
	 */
	@Field
	private Attributes attributes;
	@Field
	private String userId;
	@Field
	private String userId;
	@Field
	private String userId;
	@Field
	private String userId;
	@Field
	private String userId;
	

}
