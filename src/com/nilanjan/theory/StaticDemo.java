package com.nilanjan.theory;

public class StaticDemo {
    static int a;
    static {
        a = 100;
        System.out.println("Welcome to my app !!!");
    }
    public static void main(String[] args) {
        System.out.println("Hello from main "+StaticDemo.a);
    }
}
