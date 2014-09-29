package com.yhp.myweb.domain.demo;

import java.util.Calendar;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


/** 
 * @ClassName: UserPO 
 * @Description: TODO
 * @author 
 * @date 2014-8-27 ÏÂÎç12:01:05 
 *  
 */

public class UserPO
{
	private int id;
	private String userName;
	private String passWord;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startTime;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endTime;
	/**
	 * @return id
	 */
	
	public int getId()
	{
		return id;
	}
	/**   
	 * @param id the id to set   
	 */
	
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * @return userName
	 */
	
	public String getUserName()
	{
		return userName;
	}
	/**   
	 * @param userName the userName to set   
	 */
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	/**
	 * @return passWord
	 */
	
	public String getPassWord()
	{
		return passWord;
	}
	/**   
	 * @param passWord the passWord to set   
	 */
	
	public void setPassWord(String passWord)
	{
		this.passWord = passWord;
	}
	/**
	 * @return startTime
	 */
	
	public Date getStartTime()
	{
		return startTime;
	}
	/**   
	 * @param startTime the startTime to set   
	 */
	
	public void setStartTime(Date startTime)
	{
		this.startTime = startTime;
	}
	/**
	 * @return endTime
	 */
	
	public Date getEndTime()
	{
		return endTime;
	}
	/**   
	 * @param endTime the endTime to set   
	 */
	
	public void setEndTime(Date endTime)
	{
		if (endTime != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(endTime);
			cal.add(Calendar.DATE, +1);
			cal.add(Calendar.SECOND, -1);
			Date realDate = cal.getTime();
			this.endTime = realDate;
		} else {
			this.endTime = endTime;
		}
	}
}
