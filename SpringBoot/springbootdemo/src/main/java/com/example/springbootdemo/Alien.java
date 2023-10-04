package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*prototype scope create object when you use getBean method*/
/*@Scope(value = "prototype")*/
public class Alien {

    private int aId;
    private String aName;
    private String tech;
    @Autowired
   /*@Qualifier("laptop") *//*Search by name, default name is decapitalized class name*/
    @Qualifier("lap1")
    private Laptop laptop;


    public Alien() {
        super();
        System.out.println("object created");
    }

    public int getaId() {
        return aId; }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show(){

        System.out.println("in show");
        laptop.compile();
    }
}
