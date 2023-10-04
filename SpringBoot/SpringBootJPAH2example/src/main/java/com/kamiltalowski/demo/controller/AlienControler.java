package com.kamiltalowski.demo.controller;

import com.kamiltalowski.demo.dao.AlienRepo;
import com.kamiltalowski.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienControler {
    @Autowired
    AlienRepo repo;

    @RequestMapping
    public String home() {
        return "home.jsp";
    }
    @DeleteMapping("/alien/{aId}")
    public String deleteAlien(@PathVariable int aId){
        Alien a = repo.getReferenceById(aId);
        repo.delete(a);

        return "deleted";

    }
    @PostMapping(value = "/alien",consumes={"application/xml","application/json"})
    public Alien addAlien(@RequestBody Alien alien){
        repo.save(alien);
        /*return "home.jsp";*/
        return alien;
    }
/*    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aId){
        ModelAndView modelAndView = new ModelAndView("showAlien.jsp");

        Alien alien = repo.findById(aId).orElse(new Alien());
        *//*System.out.println(repo.findByTechnology("java"));
        System.out.println(repo.findByaIdGreaterThan(102));
        System.out.println(repo.findByTechNameSorted("java"));*//*

        modelAndView.addObject(alien);
        return modelAndView;
    }*/

    @GetMapping(path= "/aliens", produces={"application/xml","application/json"})
    @ResponseBody
    public List<Alien> getAliens(){

        return repo.findAll();
    }
    @PutMapping(value = "/alien",consumes={"application/xml","application/json"})
    public Alien addOrUpdateAlien(@RequestBody Alien alien){
        repo.save(alien);
        /*return "home.jsp";*/
        return alien;
    }
    @RequestMapping(value = "/alien/{aId}")
    @ResponseBody
    public Optional<Alien> getAlien(@PathVariable("aId") int aId){

        return repo.findById(aId);
    }
}
