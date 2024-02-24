package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CLoinServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println(email+password);
		
		if(email.equals("rock@gmail.com") && password.equals("rokcerr")) {
			
			
			Cookie c = new Cookie("login", "yes");
			response.addCookie(c);
			
			
			request.getRequestDispatcher("CHome.jsp").forward(request, response);
		}else {
			
			request.setAttribute("error", "Invalid Credentials");
			request.getRequestDispatcher("CLogin.jsp").forward(request, response);
		}
	
	}

}

