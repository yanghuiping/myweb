package com.yhp.myweb.dao.demo;

import java.util.List;
import java.util.Map;


/** 
 * @ClassName: IBaseMapper 
 * @Description: TODO
 * @author 
 * @date 2014-8-28 上午10:28:37 
 *  
 */

public interface IBasePageMapper
{
	/**
	 * 
	 * @Title: getPages 
	 * @Description: 分页查询条数
	 * @param parameterObject
	 * @return
	 */
	public List<Object> getPages(Map<String,Object> parameterObject);
	/**
	 * 
	 * @Title: getPagesCount 
	 * @Description: 分页查询
	 * @param parameterObject
	 * @return
	 */
	public long getPagesCount(Map<String,Object> parameterObject);
}
