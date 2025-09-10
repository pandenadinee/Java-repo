package com.oopsPractice;

public class OverloadingDemo {


    public String m1(String name , String surName){
        System.out.println("this is m1 two parameter method");
        return name + surName;

    }
    public int m1(int age){
        System.out.println("this is one argument type parameter");
        return age;

    }

    public static void main(String[] args) {
        OverloadingDemo demo = new OverloadingDemo();
        System.out.println(demo.m1(25));
        System.out.println(demo.m1("nadini" , "pande"));
    }
}
