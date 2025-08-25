package com.collectionProgram;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet ls = new LinkedHashSet();
        ls.add(10);
        ls.add(2);
        ls.add(3);
        ls.add(1);
        ls.add(2);
        ls.add("puja");
        System.out.println(ls);
    }
}
