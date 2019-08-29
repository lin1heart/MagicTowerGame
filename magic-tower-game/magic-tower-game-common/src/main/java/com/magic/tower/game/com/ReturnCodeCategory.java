package com.magic.tower.game.com;

public enum ReturnCodeCategory {

	SUCCESS(0),
	FAILURE_SYSTEM_OTHER(-1),
	FAILURE_COMMON_OTHER(-101);

	private ReturnCodeCategory(int code) {
		this.code = String.valueOf(code);
	}

	private final String code;

	public String getCode() {
		return code;
	}

	public boolean isSuccess() {
		return SUCCESS.code.equals(code);
	}

	public boolean isFailure() {
		return !isSuccess();
	}

	public static ReturnCodeCategory find(String code) {
		ReturnCodeCategory found = null;
		for (ReturnCodeCategory element : values()) {
			if (element.code.equals(code)) {
				found = element;
				break;
			}
		}
		return found;
	}

	public static boolean isSuccess(String code) {
		return SUCCESS.code.equals(code);
	}

	public static boolean isFailure(String code) {
		return !isSuccess(code);
	}

}
