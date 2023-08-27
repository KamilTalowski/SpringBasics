package com.talowski.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.talowski.web.dao.PersonDao;
import com.talowski.web.model.Person;


/**
 * Servlet implementation class GetPersonController
 */
public class GetPersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pid = Integer.parseInt(request.getParameter("getPid"));
		PersonDao dao = new PersonDao();
		Person p1 = dao.getPerson(pid);
		
		request.setAttribute("person", p1);
		
		RequestDispatcher rd = request.getRequestDispatcher("showPerson.jsp");
		rd.forward(request, response);
		
	}



}
