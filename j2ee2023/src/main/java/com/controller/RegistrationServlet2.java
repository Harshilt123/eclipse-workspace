package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// user input -> request
		String LastName = request.getParameter("lastName"); //
		String firstName = request.getParameter("firstName"); //
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println(LastName);
		System.out.println(email);
		System.out.println(password);

		try {
			PrintWriter out = response.getWriter();
			
			response.setContentType("text/html");// this will inform your client/ browser that i am sending an html page 
			
			out.print("<br>FirstName : "+firstName);
			 out.print("<br>LastName : "+LastName);
			 out.print("<br>Email : "+email );
			 out.print("<br>Password :"+password);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
