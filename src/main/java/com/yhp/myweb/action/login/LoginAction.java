package com.yhp.myweb.action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yhp.myweb.common.base.BaseAction;
import com.yhp.myweb.domain.demo.UserPO;


/** 
 * @ClassName: LoginAction 
 * @Description: TODO
 * @author 
 * @date 2014-8-28 下午4:24:55 
 *  
 */
@Controller
public class LoginAction extends BaseAction
{
	@RequestMapping(value="/toLogin.htm",method={RequestMethod.GET})
	public ModelAndView toLogin(){
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/login.htm",method={RequestMethod.POST})
	public ModelAndView login(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		String viewName = "login";
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		if("admin".equals(userName) && "admin".equals(passWord)){
			UserPO user = new UserPO();
			user.setUserName(userName);
			user.setPassWord(passWord);
			request.getSession().setAttribute("loginUser", user);
			viewName = "redirect:main.htm";
		}else{
			modelAndView.addObject("errorTips", "用户名或密码错误...");
		}
		modelAndView.setViewName(viewName);
		return modelAndView;
	}
	
	@RequestMapping(value="/main.htm",method={RequestMethod.GET})
	public ModelAndView main(){
		ModelAndView modelAndView = new ModelAndView("main");
		return modelAndView;
	}
	
	@RequestMapping(value="/loginOut.htm",method={RequestMethod.GET})
	public ModelAndView loginOut(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("login");
		HttpSession session = request.getSession();
		if(session != null){
			session.removeAttribute("loginUser");
		}
		return modelAndView;
	}
}
