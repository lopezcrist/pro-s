package com.wozeze.pros.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 首页过滤器
 * 
 * @author duliang
 * 
 */
public class IndexPageFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("index");// 转发给index.action
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String path = req.getServletPath();
		if("/index.jsp".equals(path)){
			dispatcher.forward(req, res);
		}else{
			chain.doFilter(req, res);
		}
	}

	public void destroy() {

	}
}
