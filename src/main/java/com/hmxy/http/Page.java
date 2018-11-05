package com.hmxy.http;

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
public class Page<T> {

	private List<T> rows;
	private Integer pageNum;
	private Integer pageSize;
	private Integer total;

}
