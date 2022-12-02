package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
/*DEPENDENCY INJECTION AND AUTOWIRE EXAMPLE*/
public class SpringbootdemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
        /*Default springboot uses singleton design witch always give us prepared one instance of an object  */
/*        Alien a = context.getBean(Alien.class);
        a.show();
        Alien a1 = context.getBean(Alien.class);
        a1.show();*/

        Alien a1 = context.getBean(Alien.class);
        a1.show();
    }

}
