package com.oops;

public class FinalStaticBlockDemo {
    final static  int x;
    final static int y =2;
   static  {
        x=20;
       System.out.println("hi i am executing first");
    }

    public static void main(String[] args) {
        System.out.println(FinalStaticBlockDemo.x);
        FinalStaticBlockDemo fs = new FinalStaticBlockDemo();
        System.out.println(fs.y);
//        x =3;
    }
}
