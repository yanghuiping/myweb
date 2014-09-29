package com.yhp.myweb.common.web.support;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * ��ҳ��ǩ����
 * @see www.springside.org.cn
 * @date Sep 18, 2007 2:33:45 PM
 * @version
 */
public class Page implements Serializable {
	
	private static final long serialVersionUID = 6952374745215033084L;

	public static final String PAGE_SIZE_COOKIE_NAME = "demo_pageSize";

	public static final int DEFAULT_PAGE_SIZE = 20;   // Ĭ��ÿҳ��¼����

	private int pageSize = DEFAULT_PAGE_SIZE;         // ÿҳ��¼��

	private long start;                               // ��ǰҳ��һ��������List�е�λ��,��0��ʼ

	private Object data;                              // ��ǰҳ�д�ŵļ�¼,����һ��ΪList

	private long totalCount;                          // �ܼ�¼��

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
	 * �����ҳ��
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
	 * ȡ��Ҳ��ǰҳ�棬 ҳ���1��ʼ
	 * 
	 * @return
	 */
	public long getCurrentPageNo() {
		return start / pageSize + 1;
	}

	/**
	 * �Ƿ�����һҳ
	 * 
	 * @return
	 */
	public boolean hasNextPage() {
		return this.getCurrentPageNo() < this.getTotalPageCount() - 1;
	}

	/**
	 * �Ƿ�����һҳ
	 * 
	 * @return
	 */
	public boolean hasPerviousPage() {
		return this.getCurrentPageNo() > 1;
	}

	/**
	 * ��ȡ����ҳ�����ݼ��α��λ��
	 * 
	 * @see #getStartOfPage(int, int)
	 */
	public static final int getStartOfPage(int pageNo) {
		return getStartOfPage(pageNo, DEFAULT_PAGE_SIZE);
	}

	/**
	 * �������һҳ��һ�������������ݽ������λ��.
	 * 
	 * @param pageNo ��1��ʼ��ҳ��
	 * @param pageSize ÿҳ��¼����
	 * @return ��ҳ�ĵ�һ�������ڽ��������ֵ��
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