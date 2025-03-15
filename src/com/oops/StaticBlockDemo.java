package com.oops;

public class StaticBlockDemo {
    static int x;
    static String name;
    static int age;
    static {
        x = 10;
        name = "nandini";
        age = 24;
        x = 20;
    }
    public static void main(String[] args){
        System.out.println(x+" "+name+" "+age);
        System.out.println(StaticBlockDemo.x);
    }
}
