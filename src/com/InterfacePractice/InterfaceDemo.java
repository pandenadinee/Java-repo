package com.InterfacePractice;

public  class InterfaceDemo implements Bird {

    public static void main(String[] args) {

        Sparro s = new Sparro();
        s.makeSaound();



        Bird b = new InterfaceDemo();
        b.sleep();
        b.makeSaound();
    }

    @Override
    public void makeSaound() {
        System.out.println("hi");
    }
}