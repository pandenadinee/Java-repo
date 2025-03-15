package com.collectionPractice;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet ls = new LinkedHashSet();
        ls.add(10);
        ls.add(20);
        ls.add(20);
        ls.add('a');
        ls.add("nishi"  );
        System.out.println(ls);
        ls.add(null);
        System.out.println(ls);

        System.out.println(ls.getFirst());
        System.out.println(ls.getLast());
    }
}
