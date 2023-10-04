package com.talowski.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.talowski.demo.dao.PersonRepo;
import com.talowski.demo.model.Person;

@RestController
@RequestMapping
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
	
	@RequestMapping("/persons")
	@ResponseBody
	public String getPersons() 
	{
		return repo.findAll().toString();
	}
	
	@RequestMapping("/person/{pid}")
	@ResponseBody
	public String getPerson(@PathVariable int pid) 
	{
		return repo.findById(pid).toString();
	}

}
