package com.oops;

public class ConstructorOverloading {
    int x;
    String name;
    int z;
     ConstructorOverloading(){

         this(200);
         System.out.println("defalt ctt");
     }
     ConstructorOverloading(int x){
         this(200,"uday");
         System.out.println("one arg ctt");

     }
     ConstructorOverloading(int x,String name){
         System.out.println("two arg ctt");
         this.x=x;
         this.name = name;
     }
     ConstructorOverloading(int x, String y ,int z){

     }

    public static void main(String[] args) {
        ConstructorOverloading c = new ConstructorOverloading();
        System.out.println(c.x+" "+c.name);

        ConstructorOverloading c1 = new ConstructorOverloading(1);
        System.out.println(c1.x+" "+c1.name);


    }



}
