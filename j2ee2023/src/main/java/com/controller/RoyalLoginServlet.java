package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RoyalLoginServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		String email = request.getParameter("email");
		
		String password = request.getParameter("password");
		
		if(email.equals("my@gmail.com") && password.equals("my123"))
		{
			
            Cookie c = new Cookie("login","yes");
            response.addCookie(c);
            
			
			request.getRequestDispatcher("RoyalHome.jsp");
			
		}
		else
		{
			request.setAttribute("error","invalid credentials");
			
		}
	
	}

}
