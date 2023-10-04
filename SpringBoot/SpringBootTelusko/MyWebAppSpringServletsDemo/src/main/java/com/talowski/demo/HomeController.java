package com.talowski.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;


@Controller
public class HomeController 
{
	@RequestMapping("home")
	public String home(HttpServletRequest request, HttpServletResponse response) 
	{
		HttpSession session= request.getSession();
		String name= request.getParameter("name");
		
		System.out.println("hi " + name);
		
		session.setAttribute("name", name);
		
		
		return "home";
	}
}
