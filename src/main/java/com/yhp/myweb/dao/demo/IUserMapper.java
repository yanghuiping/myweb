package com.yhp.myweb.dao.demo;

import com.yhp.myweb.domain.demo.UserPO;


/** 
 * @ClassName: IUserMapper 
 * @Description: TODO
 * @author 
 * @date 2014-8-27 ионГ11:59:44 
 *  
 */
public interface IUserMapper extends IBasePageMapper
{
	public UserPO findUserById(int id);
}
