package com.cs2c.dvs.common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	public void destroy() {

	}

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// 转换为http的请求和响应对象

		HttpServletRequest servletRequest = (HttpServletRequest) arg0;
		HttpServletResponse servletResponse = (HttpServletResponse) arg1;
		
		servletResponse.setContentType("html/text;charset=utf-8");
		PrintWriter out = servletResponse.getWriter();
		
		String path = servletRequest.getRequestURI();

		//System.out.println("path"+path);
		// -------------验证登陆-----------		
		HttpSession session=servletRequest.getSession();
		boolean flag = path.equals("/jsp/login.jsp");
		if (session.getAttribute("userEmail") == null&&!flag) {
			servletResponse.sendRedirect(
					servletRequest.getContextPath()+ "/login.jsp");
			return;
		}else{
			//
			arg2.doFilter(servletRequest, servletResponse);
		}
	}
}
