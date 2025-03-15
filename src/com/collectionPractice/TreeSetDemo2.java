package com.collectionPractice;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {

//        TreeSet t = new TreeSet(new MyComp());
        TreeSet t = new TreeSet(Comparator.reverseOrder());
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        System.out.println(t);

    }

}

