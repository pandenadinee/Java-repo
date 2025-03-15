package com.oops;

public class StaticDemo {
    static int x = 10;
    static int y = 49;
    static String name = "nandini";

    public static void main(String[] args) {
        System.out.println(StaticDemo.x +" " + StaticDemo.y + " "+StaticDemo.name);
        StaticDemo s = new StaticDemo();
        s.x = 20;
        s.y = 30;
        s.name = "aarushi";
        System.out.println(x+" "+y+" "+name);
        System.out.println(s.x);
    }
}
