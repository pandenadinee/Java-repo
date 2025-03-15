package com.oops;

public class SuperExample {
    int w ;
    String name;

    SuperExample(int w){
        this.w = w;

    }
    SuperExample(){
        System.out.println("defoult constructor");
    }
    void display(){
        System.out.println("number "+w);
    }

}
 class Test extends SuperExample{
    int y ;
    int w;
    Test(int y,int w){
        super(300);
        this.y = y;
        this.w = w;

    }

     @Override
     void display() {
         super.display();
         System.out.println("i am child class method");
     }

     public static void main(String[] args) {
         SuperExample s = new SuperExample(100);
         System.out.println(s.w);

         s.display();
         Test t = new Test(200,400);
         System.out.println(t.y+" "+t.w);
         t.display();
     }
 }

