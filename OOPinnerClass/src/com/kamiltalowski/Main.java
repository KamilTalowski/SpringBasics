package com.kamiltalowski;

/*
* Inner class:
*   Member class
*   Static class
*   Anonymous class(next lesson)
* */

class Outer{
    static int a;
    static public void show(){
        System.out.println("Outer");
    }

    static class Inner{             // Outer$Inner.class
        public void display(){
            System.out.println("Inner");
        }
    }
}

public class Main {

    //variable, method, class

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        //no static
        /*Outer.Inner obj1 = obj.new Inner();
        obj1.display();*/

        //static Inner class, we dont need Outer class obj to create Inner class
        Outer.Inner obj1 = new Outer.Inner();
        obj1.display();

    }
}
