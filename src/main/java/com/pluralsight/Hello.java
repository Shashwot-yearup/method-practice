package com.pluralsight;

public class Hello {

    //create a main method because that where all our code runs
    public static void main(String[] args) {
        sayHello();
        sayGoodbye();
        GoodMorning();
    }

    //other method go below this comment

    //make a method called sayHello that print hello world
    public  static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void sayGoodbye(){
        System.out.println("Goodbye!");
    }

    public static void GoodMorning(){
        System.out.println("Good Morning");
    }
}
