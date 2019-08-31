package com.magic.tower.game.mdb.entity;

/**
 * 属性
 * @author linyunzhe
 *
 */
public class Attributes {

	/*
	 * 攻击力
	 */
	public Integer attack;
	/**
	 * 防御值
	 */
	public Integer defence;
	/**
	 * 血量
	 */
	public Integer hp;
	/**
	 * 敏捷值?攻速
	 */
	public Integer dex;
	/**
	 * 魔法值，能量值
	 */
	public Integer mp;
	
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public Integer getDefence() {
		return defence;
	}
	public void setDefence(Integer defence) {
		this.defence = defence;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getDex() {
		return dex;
	}
	public void setDex(Integer dex) {
		this.dex = dex;
	}
	public Integer getMp() {
		return mp;
	}
	public void setMp(Integer mp) {
		this.mp = mp;
	}
}
