package com.kamiltalowski;

// one normal method one abstract
@FunctionalInterface
interface Demo
{
    void abc();
    default void show(){
        System.out.println("in Demo show");
    }
}

interface MyDemo{
    default void show(){
        System.out.println("in Demo show");
    }
}

class DemoImp  implements Demo, MyDemo
{

    @Override
    public void abc()
    {
        System.out.println("in abc");
    }
    //2. method u can override method and still call intended supper class method, so there is no confusion
    @Override
    public void show() {
        Demo.super.show();
    }
    // you can override default method, and doing that this is one way to solve multiple inheritance
    /*@Override
    public void show(){
        System.out.println("in DemoImp override show");
    }*/

}
public class Main
{

    public static void main(String[] args)
    {
         Demo obj = new DemoImp();
         obj.abc();
         obj.show();
    }
}
