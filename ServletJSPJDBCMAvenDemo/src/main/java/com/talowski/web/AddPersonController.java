package com.talowski.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.talowski.web.dao.PersonDao;

/**
 * Servlet implementation class AddPerson
 */
public class AddPersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		String pass = request.getParameter("pass");
		
		
		PersonDao dao = new PersonDao();
		int isCreated = dao.setPerson(pid,pname,pass);
		
		request.setAttribute("isCreated", isCreated);
		
		RequestDispatcher rd = request.getRequestDispatcher("showPerson.jsp");
		rd.forward(request, response);
	}

}
