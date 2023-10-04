package com.talowski.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@DeleteMapping("/person/{pid}")
	public String deletePerson(@PathVariable int pid) 
	{
		Person p = repo.getReferenceById(pid);
		repo.delete(p);
		return "deleted";
	}
	
	@PostMapping(path="/person", consumes= {"application/json"})
	public Person addPerson(@RequestBody Person person) //RequestBody allows raw data to be send
	{
		
		repo.save(person);
		return person;
	}
	
	//@RequestMapping(path="/persons", produces= {"application/xml"}) //bans json and others if there are any
	@RequestMapping(path="/persons")
	@GetMapping
	@ResponseBody
	public List<Person> getPersons() 
	{
		return repo.findAll();
	}
	
	@PutMapping(path="/person", consumes= {"application/json"})
	public Person savePerson(@RequestBody Person person) //RequestBody allows raw data to be send
	{
		
		repo.save(person);
		return person;
	}
	
	@RequestMapping("/person/{pid}")
	@ResponseBody
	public Optional<Person> getPerson(@PathVariable int pid) 
	{
		return repo.findById(pid);
	}

}
