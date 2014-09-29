package com.yhp.myweb.common.web.support;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public abstract class BasePageAction
{
	protected Logger log = Logger.getLogger(this.getClass());

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	
	protected int pageNo = 1;
	
	protected Page page = new Page();
	
	protected String jumpPageNo;//dummy field

	/**
	 * @return request
	 */

	public HttpServletRequest getRequest()
	{
		if(request == null){
			ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
			request = servletRequestAttributes.getRequest();
		}
		return request;
	}

	/**
	 * @param request
	 *            the request to set
	 */

	public void setRequest(HttpServletRequest request)
	{
		this.request = request;
	}

	/**
	 * @return response
	 */

	public HttpServletResponse getResponse()
	{
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */

	public void setResponse(HttpServletResponse response)
	{
		this.response = response;
	}

	/**
	 * @return session
	 */

	public HttpSession getSession()
	{
		return request.getSession();
	}

	/**
	 * @param session
	 *            the session to set
	 */

	public void setSession(HttpSession session)
	{
		this.session = session;
	}
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public void setServletRequest(HttpServletRequest request) {
		if(page == null){
			page = new Page();
		}
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(Page.PAGE_SIZE_COOKIE_NAME)) {
					if (cookie.getValue() != null) {
						page.setPageSize(Integer.parseInt(cookie.getValue()));
					}
					break;
				}
			}
		}
	}

	/**
	 * @return the jumpPageNo
	 */
	public String getJumpPageNo() {
		return jumpPageNo;
	}

	/**
	 * @param jumpPageNo the jumpPageNo to set
	 */
	public void setJumpPageNo(String jumpPageNo) {
		this.jumpPageNo = jumpPageNo;
	}
}
