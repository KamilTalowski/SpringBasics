package com.talowski;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addPerson")
public class MyServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7412655499766789558L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		
		int pid =Integer.parseInt(request.getParameter("pid"));
		String pname =request.getParameter("pname");
		
		out.println("welcome " + pname);
	}
}
