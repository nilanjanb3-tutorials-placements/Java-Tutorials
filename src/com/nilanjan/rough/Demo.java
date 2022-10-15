package com.nilanjan.rough;


import java.util.Scanner;

class A
{
    void  method(int a)
    {
        System.out.println("Method A");
    }
}
class B extends A
{
    int i,temp,rev=0;
    void method(int a)
    {
        System.out.println("Method B");

    }
}


class Demo{
    public static void main(String ABC[])
    {

        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

        A a= new A();
        a.method(x);




        B b= new B();
        b.method(x);

    }
}
