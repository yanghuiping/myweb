package com.yhp.myweb.common.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yhp.myweb.domain.demo.UserPO;

public class ControllerContext implements Serializable {
	private static final long serialVersionUID = -6344965110266195946L;
	private static ThreadLocal<ControllerContext> controllerContext = new ThreadLocal<ControllerContext>();
	private Map<Object, Object> context;

	private static final String REQUEST = "javax.servlet.http.HttpServletRequest";
	private static final String RESPONSE = "javax.servlet.http.HttpServletResponse";
	private static final String USERDO = "com.yhp.myweb.domain.demo.UserPO";

	public ControllerContext(Map<Object, Object> context) {
		this.context = context;
	}

	public static void setContext(ControllerContext context) {
		controllerContext.set(context);
	}
	
	public static void removeContext() {
		controllerContext.remove();
	}

	public static ControllerContext getContext() {
		ControllerContext context = (ControllerContext) controllerContext.get();
		if (null == context) {
			context = new ControllerContext(new HashMap<Object, Object>());
			setContext(context);
		}
		return context;
	}

	public Map<Object, Object> getContextMap() {
		return this.context;
	}

	public void setContextMap(Map<Object, Object> contextMap) {
		getContext().context = contextMap;
	}

	public Object get(Object key) {
		return context.get(key);
	}

	public void put(Object key, Object value) {
		context.put(key, value);
	}

	public void setRequest(HttpServletRequest request) {
		put(REQUEST, request);
	}
	
	public void setUserDO(UserPO user) {
		put(USERDO, user);
	}

	public void setResponse(HttpServletResponse response) {
		put(RESPONSE, response);
	}
	
	public HttpServletRequest getRequest() {
		return (HttpServletRequest) get(REQUEST);
	}

	public UserPO getUserDO() {
		return (UserPO) get(USERDO);
	}
	
	public HttpServletResponse getResponse() {
		return (HttpServletResponse) get(RESPONSE);
	}

	public HttpSession getSession() {
		return getRequest().getSession();
	}

	public ServletContext getApplication() {
		return getSession().getServletContext();
	}
}