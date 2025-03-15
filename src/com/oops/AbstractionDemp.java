package com.oops;

abstract class AbstractionDemp {
    public abstract void m1();

    public void test(){
        System.out.println("hey i am here to print");

    }
    public abstract void m2();
}
class Demo extends AbstractionDemp{
    @Override
    public void m1(){
        System.out.println("hi");
    }

    @Override
    public void m2() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();
        d.m2();
        d.test();
    }

}

