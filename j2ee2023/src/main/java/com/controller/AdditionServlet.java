package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdditionServle")
public class AdditionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1466813521594047169L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String x = request.getParameter("num1");
		String y = request.getParameter("num2");

		int validation = 0;//

		if (x == null || x.trim().length() == 0) {
			validation = -1;
		}

		if (y == null || y.trim().length() == 0) {
			validation = -1;
		}

		if (validation == 0) {

			// Get the values of the two numbers from the form
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			int result = 0;
			String op = request.getParameter("op");

			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			if (op.equals("Add")) {
				result = num1 + num2;
				out.print(num1 + " + " + num2 + " = " + result);
			} else if (op.equals("Sub")) {
				result = num1 - num2;
				out.print(num1 + " - " + num2 + " = " + result);
			} else if (op.equals("Mul")) {
				result = num1 * num2;
				out.print(num1 + " * " + num2 + " = " + result);
			} else if (op.equals("Div")) {
				result = num1 / num2;
				out.print(num1 + " / " + num2 + " = " + result);
			} else {
				out.print("Invild Opration");

			}
		}else {

			response.setContentType("text/html");
			PrintWriter  out  = response.getWriter();
			out.print("Please Enter all input " );
		}
	}

}
