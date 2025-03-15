package com.oops;

public class NonStaticDemo {
    int x = 20;
    String name = "aanchal";
    int y;
    NonStaticDemo(int y){
        this.y = y;

    }
    public static void main(String[] args){
        System.out.println("hello i am nonStatic variable");
        NonStaticDemo s1 = new NonStaticDemo(30);
        System.out.println(s1.x+" "+s1.name+" "+s1.y);
        NonStaticDemo s2 = new NonStaticDemo(40);
        System.out.println(s2.y);


    }
}
