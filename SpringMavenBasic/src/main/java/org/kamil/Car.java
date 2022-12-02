package org.kamil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    @Autowired
    private Tire tyre;

    public Tire getTyre() {
        return tyre;
    }

    public void setTyre(Tire tyre) {
        this.tyre = tyre;
    }

    public void drive(){
        System.out.println("car  " + tyre);
    }
}
