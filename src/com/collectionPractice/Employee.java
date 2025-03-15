package com.collectionPractice;

import org.jetbrains.annotations.NotNull;

import java.util.TreeMap;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{
    Integer Id ;
    String name;
    public Employee(int Id,String name){
        this.Id = Id;
        this.name = name;

    }
    public String toString(){
        return this.Id + " " + this.name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(100,"sneha");
        Employee e2 = new Employee(200,"vidya");
        Employee e3 = new Employee(300,"chinki");
        Employee e4 = new Employee(400,"sima");
        Employee e5 = new Employee(500,"raju");

        TreeSet t = new TreeSet<>();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);

    }
    @Override
    public int compareTo(@NotNull Employee f) {
        return f.Id.compareTo(this.Id);

//        Employee first = this;
//        Employee second = f;
//        if (first.Id <second.Id) return 1;
//        else if (first.Id > second.Id) {
//            return -1;
//        }
//

    }
}
