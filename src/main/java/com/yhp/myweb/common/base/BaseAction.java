package com.yhp.myweb.common.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public abstract class BaseAction
{
	protected Logger log = Logger.getLogger(this.getClass());

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;

	/**
	 * @return request
	 */

	public HttpServletRequest getRequest()
	{
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		request = servletRequestAttributes.getRequest();
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
		return getRequest().getSession();
	}

	/**
	 * @param session
	 *            the session to set
	 */

	public void setSession(HttpSession session)
	{
		this.session = session;
	}
}
