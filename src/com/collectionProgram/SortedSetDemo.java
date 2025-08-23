package com.collectionProgram;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet();
        ss.add(1);
        ss.add(2);
        ss.add(3);
        ss.add(4);
        System.out.println(ss);
        System.out.println(ss.getFirst());
        System.out.println(ss.getLast());
        System.out.println(ss.subSet(1, 4));
        System.out.println(ss.headSet(4));
        System.out.println(ss.tailSet(1));
        System.out.println(ss.comparator());


    }
}
