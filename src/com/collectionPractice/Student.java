package com.collectionPractice;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

public class Student implements Comparable<Student>{
    Integer roll;
    String name;
    public Student(int roll, String name ){
        this.roll = roll;
        this.name = name;

    }

    public String toString(){
        return this.roll + " " + this.name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "uday");
        Student s2 = new Student(5, "nisha");
        Student s3 = new Student(2, "pankaj");
        Student s4 = new Student(0, "rahul");
        TreeSet t = new TreeSet();
        t.add(s1);// In empty it will simply add , no comapre
        t.add(s2);// s2.comapreTo(s);
        t.add(s3);
        t.add(s4);

        System.out.println(t);

    }

  // s1.comparetTo(s2);

    @Override
    public int compareTo(@NotNull Student s) {
//       Student first = this;
//       Student second = s;
      return roll.compareTo(s.roll);
//       if( first.roll < second.roll ) return -1;
//       else if( first.roll > second.roll) return  1;
//       else return 0;


    }
}
