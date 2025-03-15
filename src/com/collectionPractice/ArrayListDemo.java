package com.collectionPractice;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add("nandini");
        l.add('A');
        l.add(null);
        System.out.println(l);
        l.add(2,"pandey");
        System.out.println(l);
        l.remove(1);
        System.out.println(l);

        ArrayList al = new ArrayList();
        al.add(40);
        al.add("uday");
        al.addAll(l);
        System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.size());

    }

}
