package com.hmxy.http;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 分页类
 * 
 * @author youzi
 *
 * @param <T>
 */
@Data
public class PageInfo<T> implements Serializable {

	private String code;
	private List<T> data;
	private Integer pageNum;
	private Integer pageSize;
	private Integer count;

}
