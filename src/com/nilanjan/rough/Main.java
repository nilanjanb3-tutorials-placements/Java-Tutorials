package com.nilanjan.rough;

public class Main {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        for(int i = 0 ; i<100000 ; i++){
            i = i+1-1;
        }
        long b = System.currentTimeMillis();

        System.out.println(b-a);
    }
}
