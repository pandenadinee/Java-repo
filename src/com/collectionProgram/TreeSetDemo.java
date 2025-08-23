package com.collectionProgram;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(Comparator.reverseOrder());
        ts.add(50);
        ts.add(10);
        ts.add(20);
        ts.add(20);
//        ts.add("nandini");
        System.out.println(ts);
    }
}
