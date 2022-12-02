package com.kamiltalowski;


//functional interface (one method only)
@FunctionalInterface
interface Abc{
    void show();
}
//Marker interface(no methods), so we can use lambda expression on it
/*interface Marker{
}*/

public class Main {

    public static void main(String[] args) {

        /*Abc obj = new Abc() {
            @Override
            public void show() {
                System.out.println("Im the best");
            }
        };*/

        Abc obj = () -> System.out.println("Im the best"); //lambda expression

        obj.show();

    }
}
