package com.oops;

public class OverloadingDemo {
    public void m1(int i){
        System.out.println(i);
        System.out.println("first method");


    }
    public void m1(int i ,String name){

        System.out.println("second method");
        System.out.println(name);
        this.m1(100);
    }
    public void m1(int x,String id ,int y){
        System.out.println("third method");
        this.m1(20,"nandini");

    }

    public static void main(String[] args) {
        OverloadingDemo o = new OverloadingDemo();
        o.m1(200,"human",1999);
        o.m1(100,"aarushi");
    }
}
