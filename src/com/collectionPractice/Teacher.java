package com.collectionPractice;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Teacher  {
    Integer roll;
    String name ;

    Teacher(int roll,String name){
        this.name = name;
        this.roll = roll;
    }

    public String toString(){
        return this.roll+" "+this.name;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher(10, "aplle");
        Teacher t2 = new Teacher(30, "puja");
        Teacher t3 = new Teacher(40, "karihama");
        Teacher t4 = new Teacher(50, "ball");
        Teacher t5 = new Teacher(50, "ball");

        TreeSet tree = new TreeSet(new MyComparatorD());
        tree.add(t1);
        tree.add(t2);
        tree.add(t3);
        tree.add(t4);
        tree.add(t5);

        TreeMap<Teacher,String> map = new TreeMap<>(new MyComparatorD());
        map.put(t1, "uday");
        map.put(t2,"raj");
        map.put(t3,"mukes");
        System.out.println(map);


        System.out.println(tree);
    }

}
