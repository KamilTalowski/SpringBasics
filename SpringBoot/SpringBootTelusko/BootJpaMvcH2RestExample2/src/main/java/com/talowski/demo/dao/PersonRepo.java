package com.talowski.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.talowski.demo.model.Person;
import java.util.List;


public interface PersonRepo extends CrudRepository<Person, Integer>
{

}
