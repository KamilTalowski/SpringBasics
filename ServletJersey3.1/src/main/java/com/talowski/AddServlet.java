package com.talowski;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet 
{
	
	/**
	 * @throws ServletException 
	 * 
	 */
	//private static final long serialVersionUID = -18454262932104553L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		//1 output 
		// System.out.println("wynik: "+k);
		/*
		 * PrintWriter out = res.getWriter(); out.println("result is: " +k);
		 */
		
		//3 sending k in url // res.sendRedirect("sq?k="+k); //URL Rewriting
		
		//4 sending k in session
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		//4 req.setAttribute("k", k);
		// Req Dis and Redirect
		//Sesionmanagment to send data
		
		//5
		Cookie cookie =new Cookie("k", k + "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq"); //3,4,5
		
		/*//2 
		 * --RequestDispatcher--
		 * RequestDispatcher rd=req.getRequestDispatcher("sq"); rd.forward(req, res);
		 */
	}
	
	/*
	 * public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException {
	 * 
	 * doPost(req,res);
	 * 
	 * }
	 */

}
