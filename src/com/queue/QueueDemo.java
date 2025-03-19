package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.offer(10);
        queue.offer(30);
        queue.offer(40);
        queue.offer(29);
        queue.add(50);

        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.size());
//        boolean empty = queue.isEmpty();
        if (!queue.isEmpty()){
            System.out.println(queue.peek());
        }


    }
}
