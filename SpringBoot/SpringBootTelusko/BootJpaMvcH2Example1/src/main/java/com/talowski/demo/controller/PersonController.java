package com.talowski.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.talowski.demo.dao.PersonRepo;
import com.talowski.demo.model.Person;

@Controller
public class PersonController 
{
	@Autowired
	PersonRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		
		return "home.jsp";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Person person) {
		
		repo.save(person);
		return "home.jsp";
	}
	
	@RequestMapping("/getPerson")
	public ModelAndView addPerson(@RequestParam int pid) {
		
		ModelAndView mv = new ModelAndView("showPerson.jsp");
		Person person = repo.findById(pid).orElse(new Person());
		
		System.out.println(repo.findByTech("Java"));
		System.out.println(repo.findByPidGreaterThan(102));
		System.out.println(repo.findByTechSorted("Java"));
		
		mv.addObject(person);
		return mv;
	}

}
