package com.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CLogoutServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	


		
		Cookie c = new Cookie("login","yes");
		c.setMaxAge(0);
		response.addCookie(c);
		
	
		response.sendRedirect("CLogin.jsp");
		
	}

}