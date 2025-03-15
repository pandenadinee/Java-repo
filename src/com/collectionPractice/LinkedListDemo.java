package com.collectionPractice;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add('A');
        ll.add("aparajita");
        System.out.println(ll);
        ll.add(null);
        System.out.println(ll);
        ll.set(4,"pandey");
        System.out.println(ll);
        ll.addFirst("home ");
        ll.addLast("sweet");
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
