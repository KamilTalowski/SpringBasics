package com.talowski;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addPerson")
public class IdFilter extends HttpFilter implements Filter {
       
    

	/**
	 * 
	 */
	private static final long serialVersionUID = 3703634943653539512L;

	public void destroy() {

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		PrintWriter out = response.getWriter();
		
		System.out.println("In Filter 2");
		HttpServletRequest req =(HttpServletRequest) request;
		
		int pid =Integer.parseInt(request.getParameter("pid"));
		String pname =request.getParameter("pname");
		
		if(pid>1 && (pname.length()>2))
			chain.doFilter(request, response);
		else
			out.println("Invalid Input");

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
