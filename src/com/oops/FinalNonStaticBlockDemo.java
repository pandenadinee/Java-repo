package com.oops;

public class FinalNonStaticBlockDemo {
    final  int x;
    final String name;
    {
        x =200;
        name ="ajay";
        System.out.println("i am instance block");
    }
    FinalNonStaticBlockDemo(){
        System.out.println("I am constructor");

    }
    void demo(){
        System.out.println("fs: "+x+"name: "+name);
    }

    public static void main(String[] args) {
        FinalNonStaticBlockDemo fs = new FinalNonStaticBlockDemo();
        System.out.println(fs.x+" "+fs.name);
        fs.demo();
    }
}
