package com.yhp.myweb.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yhp.myweb.common.utils.ControllerContext;

public class CommonInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if(modelAndView!=null){
//			UserPO loginUser = LoginUtil.getLoginUser();
//			if(loginUser!=null){
//				modelAndView.addObject("user", loginUser);
//			}
			modelAndView.addObject("ctx", "http://localhost/myweb");
//			modelAndView.addObject("merge_http", ConfigConstants.merge_http);
//			modelAndView.addObject("cnzz_statistics", ConfigConstants.cnzz_statistics);
//			modelAndView.addObject("clicki_statistics", ConfigConstants.clicki_statistics);
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		ControllerContext.removeContext();
	}

}
