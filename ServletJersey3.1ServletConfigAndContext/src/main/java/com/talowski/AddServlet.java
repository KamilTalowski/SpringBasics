package com.talowski;

import java.io.IOException;

import java.io.PrintWriter;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServlet extends HttpServlet 
{
//	SerwletConfig and ServletContet


	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		PrintWriter out = res.getWriter();
		out.print("hi ");
		
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("name");
//		out.println(str);
		
		ServletConfig cfg = getServletConfig();
		String str = cfg.getInitParameter("name");
		out.println(str);
		


	}
}
