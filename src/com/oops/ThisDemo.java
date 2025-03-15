package com.oops;

public class ThisDemo {
    int a ;
    int b ;
    String name ;
    ThisDemo(int a ){
        this.a = a;
        b =20;
        System.out.println("constructor");
    }
    ThisDemo(){
        this(500);
        System.out.println("default constructor");
    }
    void display(){
        this.b=60;
        System.out.println("i am first method");

    }
    void test(){

        this.display();
        System.out.println("i am second method");
    }

    public static void main(String[] args) {
        ThisDemo t = new ThisDemo(50);
        System.out.println(t.a+" "+ t.b);

        ThisDemo t1 =new ThisDemo();
        System.out.println(t1.a);

        t.test();

    }
}
