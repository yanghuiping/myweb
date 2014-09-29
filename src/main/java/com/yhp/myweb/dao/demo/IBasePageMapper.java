package com.yhp.myweb.dao.demo;

import java.util.List;
import java.util.Map;


/** 
 * @ClassName: IBaseMapper 
 * @Description: TODO
 * @author 
 * @date 2014-8-28 ����10:28:37 
 *  
 */

public interface IBasePageMapper
{
	/**
	 * 
	 * @Title: getPages 
	 * @Description: ��ҳ��ѯ����
	 * @param parameterObject
	 * @return
	 */
	public List<Object> getPages(Map<String,Object> parameterObject);
	/**
	 * 
	 * @Title: getPagesCount 
	 * @Description: ��ҳ��ѯ
	 * @param parameterObject
	 * @return
	 */
	public long getPagesCount(Map<String,Object> parameterObject);
}
