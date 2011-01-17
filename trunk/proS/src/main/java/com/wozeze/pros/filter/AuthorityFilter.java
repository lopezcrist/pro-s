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

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain filter) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession();
		// 用过检查session来判断
		if (session.getAttribute("username") == null) {
			String errors = "请登录";
			request.setAttribute("errors", errors);
			request.getRequestDispatcher(
					"/pages/system/user_login.jsp").forward(request,
					response);// 跳转到这个页面
		} else {
			filter.doFilter(request, response);
		}
		StringBuffer fileURL = request.getRequestURL();
		if (fileURL.indexOf(".jpg") > 0 || fileURL.indexOf(".bmp") > 0
				|| fileURL.indexOf(".gif") > 0
				|| fileURL.indexOf("image.jsp") > 0) {
			filter.doFilter(req, res);
			return;
		}
	}

	public void init(FilterConfig req) throws ServletException {

	}

	public void destroy() {

	}

}
