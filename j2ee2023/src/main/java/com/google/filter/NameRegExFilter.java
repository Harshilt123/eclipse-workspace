package com.google.filter;

import java.io.IOException;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/NameServlet")
public class NameRegExFilter implements Filter{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String  userName =request.getParameter("userName");
		String  alpha ="[a-zA+Z]+";
		
		
		if(userName.matches(alpha)== false){
			//error
			
			request.setAttribute("NameError","Plese Enter valid Name");
			RequestDispatcher rd= request.getRequestDispatcher("Name.jsp");
			rd.forward(request, response);
	     	} else {
	     		// go Ahead 
	     		chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

}
