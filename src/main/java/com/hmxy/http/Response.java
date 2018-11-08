package com.hmxy.http;

import java.io.Serializable;

/**
 * 响应类
 * 
 * @author tangyouzhi
 *
 * @param <T>
 */
public class Response<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 555197966986119179L;

	/**
	 * 数据
	 */
	private T data;

	/**
	 * code
	 */
	private String code;

	/**
	 * 响应信息
	 */
	private String message;

	public Response<T> setData(T t) {
		this.data=t;
		return this;
	}


	public Response<T> setStatusCode(String code) {
		this.code = code;
		return this;
	}

	public Response<T> setMessage(String message) {
		this.message = message;
		return this;
	}

	public T getData() {
		return data;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
