package com.talowski.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;


@Controller
public class HomeController 
{
	@RequestMapping("home")
	//public ModelAndView home(@RequestParam ("pname") String myName) //name from browser and save to myName variable
	public ModelAndView home(Person person)
	{
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", person);
		mv.setViewName("home");
		
		
		return mv;
	}
}
