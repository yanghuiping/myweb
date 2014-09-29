package com.yhp.myweb.service.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhp.myweb.common.web.support.Page;
import com.yhp.myweb.dao.demo.IUserMapper;
import com.yhp.myweb.domain.demo.UserPO;


/** 
 * @ClassName: UserService 
 * @Description: TODO
 * @author 
 * @date 2014-8-27 ÏÂÎç1:16:38 
 *  
 */
@Service("userService")
public class UserService
{
	@Autowired
	private IUserMapper userMapper;
	
	public UserPO findUserById(int id){
		return userMapper.findUserById(id);
	}
	
	public Page queryPaged(Map<String,Object> parameterObject, int pageNo, int pageSize){
		int startIndex = Page.getStartOfPage(pageNo, pageSize);
		long totalCount = userMapper.getPagesCount(parameterObject);
		if (totalCount < 1) {
			return new Page(pageSize);
		}
		parameterObject.put("startIndex", startIndex);
		parameterObject.put("endIndex", pageNo * pageSize);
		List<Object> list = userMapper.getPages(parameterObject);
		return new Page(startIndex, totalCount, pageSize, list);
	}
}
