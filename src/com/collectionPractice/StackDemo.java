package com.collectionPractice;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push("Ena");
        System.out.println(s.search("Ena"));
        System.out.println(s);
        System.out.println(s.push('D'));
        System.out.println(s.peek());
        System.out.println(s.pop());


    }
}
