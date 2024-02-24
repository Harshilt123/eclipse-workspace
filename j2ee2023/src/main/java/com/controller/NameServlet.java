package com.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet{

	public void  service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
      String  userName =request.getParameter("userName");
      userName=userName.toUpperCase();
      
	  request.setAttribute("un",userName); 
	  
	  RequestDispatcher rd= request.getRequestDispatcher("NameUpperjsp.jsp");
	  rd.forward(request, response);
}
}