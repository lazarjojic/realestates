package com.nortal.lazar.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GlobalInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// HttpRequest request = (HttpRequest) servletRequest;
		HttpSession session = request.getSession();
		Object isAuthorizedAttribute = session.getAttribute("isAuthorized");

		if (isAuthorizedAttribute == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}

		return super.preHandle(request, response, handler);
	}

}
