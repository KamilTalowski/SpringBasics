package com.kamiltalowski;


@FunctionalInterface
interface Demo
{
    //variables by default becomes final
    int i=5;

    void abc();

    static void show(){
        System.out.println("in Demo show");
    }
}

class DemoImp implements Demo{
    public void abc(){
        //cant change value, because
        num = 9;
    }
}
public class Main
{

    public static void main(String[] args)
    {
        Demo.show();
    }
}
