package com.nilanjan.theory;
class A{
    public void msg(){
        System.out.println("Hello Java");
    }
}
class B extends A{
    @Override
    public void msg(){
        System.out.println("Hello World");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        A c = new B();

        a.msg();
        b.msg();
        c.msg();

    }
}
