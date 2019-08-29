package com.magic.tower.game.com;

import java.io.Serializable;

public class EntityResponseDataBody<T extends Serializable> extends EntityResponseBody {

	private static final long serialVersionUID = 5681668785633880119L;

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
