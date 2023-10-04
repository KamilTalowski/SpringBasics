package com.kamiltalowski.demo.dao;

import com.kamiltalowski.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

    /*List<Alien> findByTechnology(String technology);
    List<Alien> findByaIdGreaterThan(int aId);

    @Query("from Alien where technology=?1 order by aName")
    List<Alien> findByTechNameSorted(String tech);*/
}

