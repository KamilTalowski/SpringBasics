package org.kamil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!");
        //BeanFactory; for local use
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //for enterprise app
        //Vehicle obj = (Vehicle) context.getBean("car");//or bike
        //obj.drive();

        Car obj = (Car) context.getBean("car");//or bike
        obj.drive();

/*        Tire t = (Tire) context.getBean("tire");
        System.out.println(t);*/

    }
}
