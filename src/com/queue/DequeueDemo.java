package com.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque deque = new LinkedList();
        deque.offer(10);
        deque.offer(20);
        deque.offer(30);
        System.out.println(deque);
    }
}
