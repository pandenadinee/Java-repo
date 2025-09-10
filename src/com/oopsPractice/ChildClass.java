package com.oopsPractice;

public class ChildClass extends ParentClass {

    String childName ;
    String schoolName;
    int age ;


    ChildClass(String pName , String childName , String schoolName , int age ){
        super(pName , age);
        this.childName = childName;
        this.schoolName = schoolName;
        this.age = age;

    }
    public void childMethod(){
        System.out.println(childName + " : this is child nane" );
        System.out.println(schoolName + " : this is school name" + age );
    }
    public void pDetail(){

        System.out.println(childName + " "+ pName +" : overridden method of parent class");
    }

    public static void main(String[] args) {
        ParentClass p = new ParentClass( "nandini" , 25   );
        p.pDetail();

        ChildClass c = new ChildClass("nandini" , "Aarushi" , "little Mellennium " , 3);
        c.childMethod();
        c.pDetail();

    }
}
