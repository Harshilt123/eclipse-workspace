package com.google.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/NameServlet")
public class NameFilter implements Filter {

	@Override
	public void destroy() {
		
		
	}

	@Override
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("NameFilter::doFilter()");
		
		String username =request.getParameter("userName");
		if (username== null ||  username.trim().length()==0) {
			// back
			
			request.setAttribute("NameError","please Enter Name");
			RequestDispatcher rd= request.getRequestDispatcher("Name.jsp");
			rd.forward(request,response);
			
		} else {
			
			//goAhead
			chain.doFilter(request, response);// servlet, filter2,  filter3, Servlet
			
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
      
}