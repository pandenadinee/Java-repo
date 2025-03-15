package com.collectionPractice;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IndentityHMD {
    public static void main(String[] args) {
        IdentityHashMap<Integer, Character> h = new IdentityHashMap<>();
//        HashMap h = new HashMap();
        h.put(1,'b');
        h.put(3,'s');
        h.put(3,'a');
        h.put(4,'d');
        System.out.println(h);

    }
}
