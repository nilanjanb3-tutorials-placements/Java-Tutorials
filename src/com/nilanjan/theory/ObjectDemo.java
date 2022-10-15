package com.nilanjan.theory;

class Point{
    int x;
    int y;

    int z;
    Point(){

    }
    /**
     * Constructor
     * @param x
     * @param y
     */

    // 1. Using Constructor
    Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;

    }

    // 2. Using Method

    public void setValues(int a, int b){
        x = a;
        y = b;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
public class ObjectDemo {

    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        Point p2 = new Point(30,40);
        Point p3 = new Point();

//        p3.setValues(100,200);

        // 3. using reference
        p3.x = 55;
        p3.y = 65;

//        System.out.println("x: "+p1.x+" y: "+p1.y);
//        System.out.println("x: "+p2.x+" y: "+p2.y);
        // Primitive Variable --> 0, Non Primitive --> null

//        System.out.println("x: "+p3.x+" y: "+p3.y);

        Point p4 = new Point(12,20);
        Point p5 = new Point(50,60,70);

        System.out.println(p4);
        System.out.println(p5);
    }
}
