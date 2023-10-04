package com.talowski;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.servlet.http.Cookie;



public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//2
//		int k = (int) req.getAttribute("k");
//		
//		k=k*k;
//		
//		PrintWriter out= res.getWriter();
//		out.println("Result sq is: "+k);
		//3
//		int k = Integer.parseInt(req.getParameter("k"));
//		//4 
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
//		k=k*k;
		
		//5
		int k=0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		
		
		//2,3,4
		PrintWriter out= res.getWriter();
		out.println("Result sq is: "+k);
		
		System.out.println("sq called");
	}

}
