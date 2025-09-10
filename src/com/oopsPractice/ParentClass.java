package com.oopsPractice;

public class ParentClass {

    String pName ;
    int age ;


    ParentClass(){
        System.out.println("default constructor of parent class");
    }
    ParentClass(String pName , int age){
        this.pName = pName;
        this.age = age;

    }

    public void pDetail(){
        System.out.println(pName + "  this is the Parent name");
        System.out.println(age + "  this is the Parent age");
    }

    public void education(){
        System.out.println(" parent eduction is Engineer");
    }


}
