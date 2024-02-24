package com.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LloginServlet extends HttpServlet{

	//override 
	public void service(HttpServletRequest request,HttpServletResponse response) {
		//logic 

		System.out.println("hey I am inside Signup Servlet");
	}
	

}


 
