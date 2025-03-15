package com.collectionPractice;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo{
    public static void main(String[] args) {
        SortedSet ss = new TreeSet();
        ss.add(10);
        ss.add(20);
        ss.add(30);
        ss.add(40);
        ss.add(50);

        System.out.println(ss);
        System.out.println(ss.first());
        System.out.println(ss.last());

        System.out.println(ss.subSet(10,50));

        System.out.println(ss.tailSet(20));

        System.out.println(ss.headSet(30));


    }
}
