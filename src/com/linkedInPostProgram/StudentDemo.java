package com.linkedInPostProgram;

public class StudentDemo {
    int studentId ;
    String studentName ;
    int stuAge ;

    StudentDemo(int studentId , String studentName , int stuAge){
        this.studentId = studentId;
        this.studentName = studentName;
        this.stuAge = stuAge;
    }

    public static void main(String[] args) {
        StudentDemo demo =  new StudentDemo(101,"nanidini" , 25);
        System.out.println(demo.stuAge);
        System.out.println(demo.studentId);
        System.out.println(demo.studentName);

        System.out.println("**********************");

        StudentDemo demo1 = new StudentDemo(201,"Aarushi",3);
        System.out.println(demo1.studentId);
        System.out.println(demo1.studentName);
        System.out.println(demo1.stuAge);

    }
}
