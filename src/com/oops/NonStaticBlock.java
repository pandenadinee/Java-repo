package com.oops;

public class NonStaticBlock {
    int a;
    String name;

    {
        a = 40;
        name = "puja";
        System.out.println("i am non static Block");

    }

//    NonStaticBlock(int a, String name) {
//        this.a = a;
//        this.name = name;
//
//    }
//    NonStaticBlock(){
//        a = 80;
//        name = "rahul";
//
//    }
    void display(){
        System.out.println("number: "+a+" myName: "+name);
    }

    public static void main(String[] args) {
        NonStaticBlock X = new NonStaticBlock();
        System.out.println(X.a +" "+X.name);
//        NonStaticBlock x1 = new NonStaticBlock(100,"neha");
//        System.out.println(x1.a+" "+x1.name);
        X.display();
    }
}