package com.wozeze.pros.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * 登陆过滤器
 * 
 * @author Administrator
 * 
 */
public class AuthorityFilter implements Filter {

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession session = request.getSession();

		// 用过检查session来判断
		if (session.getAttribute("username") == null) {
			String errors = "请登录";
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("/pages/system/user_login.jsp").forward(request,
					response);// 跳转到这个页面
		} else {
			arg2.doFilter(request, response);
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void destroy() {

	}

}
