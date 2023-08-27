package com.talowski;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet 
{
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		/*
		 * PrintWriter out = res.getWriter();
		 * out.println("<html><body bgcolor='cyan'>"); out.println("result is: " +k);
		 * out.println("</body></html>");
		 */
		
		
		//JSTL-> JSP Standard Tag Liblary
		
		List<Student> studs = Arrays.asList(new Student(1, "Navin"), new Student(2, "Krystian"),new Student(3, "Artur"));
		
		String name ="Kamil";
		
		Student s = new Student(1, "Kamil");
		
		req.setAttribute("students", studs);
		 RequestDispatcher rd= req.getRequestDispatcher("display.jsp");
		 rd.forward(req, res);
		 
		
		
		

	}
	


}
