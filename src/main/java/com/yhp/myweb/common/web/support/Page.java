package com.yhp.myweb.common.web.support;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 分页标签对象
 * @see www.springside.org.cn
 * @date Sep 18, 2007 2:33:45 PM
 * @version
 */
public class Page implements Serializable {
	
	private static final long serialVersionUID = 6952374745215033084L;

	public static final String PAGE_SIZE_COOKIE_NAME = "demo_pageSize";

	public static final int DEFAULT_PAGE_SIZE = 20;   // 默认每页记录数量

	private int pageSize = DEFAULT_PAGE_SIZE;         // 每页记录数

	private long start;                               // 当前页第一条数据在List中的位置,从0开始

	private Object data;                              // 当前页中存放的记录,类型一般为List

	private long totalCount;                          // 总记录数

	public Page() {
		this(0, 0, DEFAULT_PAGE_SIZE, new ArrayList<Object>());
	}
	
	public Page(int pageSize) {
		this(0, 0, pageSize, new ArrayList<Object>());
	}

	public Page(long start, long totalCount, int pageSize, Object data) {
		this.pageSize = pageSize;
		this.start = start;
		this.data = data;
		this.totalCount = totalCount;
	}

	/**
	 * 获得总页数
	 * 
	 * @return
	 */
	public long getTotalPageCount() {
		if (totalCount % pageSize == 0) {
			return totalCount / pageSize;
		} else {
			return totalCount / pageSize + 1;
		}
	}

	/**
	 * 取该也当前页面， 页码从1开始
	 * 
	 * @return
	 */
	public long getCurrentPageNo() {
		return start / pageSize + 1;
	}

	/**
	 * 是否有下一页
	 * 
	 * @return
	 */
	public boolean hasNextPage() {
		return this.getCurrentPageNo() < this.getTotalPageCount() - 1;
	}

	/**
	 * 是否有上一页
	 * 
	 * @return
	 */
	public boolean hasPerviousPage() {
		return this.getCurrentPageNo() > 1;
	}

	/**
	 * 获取给定页面数据集游标的位置
	 * 
	 * @see #getStartOfPage(int, int)
	 */
	public static final int getStartOfPage(int pageNo) {
		return getStartOfPage(pageNo, DEFAULT_PAGE_SIZE);
	}

	/**
	 * 获得任意一页第一条数据所在数据结果集的位置.
	 * 
	 * @param pageNo 从1开始的页号
	 * @param pageSize 每页记录数量
	 * @return 该页的第一条数据在结果集的数值。
	 */
	public static final int getStartOfPage(int pageNo, int pageSize) {
		return (pageNo - 1) * pageSize;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}