package com.kamiltalowski.practice.basics;


//just to use any interface
@FunctionalInterface
interface HelloInterface{
    String greet();
}

class HelloClass implements HelloInterface{
    private String hello;

    public HelloClass(String hello){
        this.hello=hello;
    }

    public String greet(){
        return hello;
    };

    public void setGreet(String hello){
        this.hello = hello;
    };

}

class HelloWorld {

    public static String greet() {
        HelloClass obj = new HelloClass("something");
        obj.setGreet("hello world!");
        System.out.println(obj.greet());

        return obj.greet();

    };
}

public class Main {

    public static void main(String[] args) {
        HelloWorld.greet();
    };
}
