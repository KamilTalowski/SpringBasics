package com.kamiltalowski.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlienResource {
    @Autowired
    ALienRepository repository;

    /*@RequestMapping("aliens")*/
    @GetMapping("aliens")
    public List<Alien> Aliens() {
        List<Alien> aliens = (List<Alien>) repository.findAll();

        /*Alien a1 = new Alien();
        a1.setId(101);
        a1.setName("Kuba");
        a1.setPoints(70);

        Alien a2 = new Alien();
        a2.setId(102);
        a2.setName("Andrzej");
        a2.setPoints(80);

        aliens.add(a1);
        aliens.add(a2);*/



        return aliens;
    }
}
