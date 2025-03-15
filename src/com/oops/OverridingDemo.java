package com.oops;

public class OverridingDemo {
    int x = 10;
    String name = "payal";
    public void m1(){
        System.out.println("first method");
    }
    public void m2(){
        System.out.println("second method");
    }
    public static void m3(){
        System.out.println("i am static method");
    }
}

class T extends OverridingDemo{
    @Override
    public void m1() {
        System.out.println("overriden method");
    }

    @Override
    public void m2() {
        super.m2();
    }

//    public void m3(){
//
//    }
    public static void m3(){
//        super.m3();
        System.out.println("i am not overriding  method ,i am method hiding");

    }

    public static void main(String[] args) {
        T t = new T();
        t.m1();
        t.m2();
        t.m3();

        OverridingDemo o = new T();
        o.m1();

    }
}

