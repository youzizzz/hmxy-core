package com.hmxy.http;

public enum HttpStatusEnum {

	/**
	 * 成功
	 */
	success("10000", "成功"),

	/**
	 * 失败
	 */
	error("10001", "失败"),

	/**
	 * 登录成功
	 */
	loginSuccess("100000","登录成功"),

	/**
	 * 登录失败
	 */
	loginError("100001","登录失败");


	/**
	 * code
	 */
	String code;

	/**
	 * 描述
	 */
	String description;

	private HttpStatusEnum(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

}
