package com.InterfacePractice;

public class D implements Bird, Animal {
    @Override
    public void insects() {
        System.out.println("i am example of multilevel inheritance example");
    }

    @Override
    public void makeSaound() {
        System.out.println("hello");

    }

    public static void main(String[] args) {
        D d = new D();
        d.makeSaound();
        d.sleep();
        d.insects();
    }
}
