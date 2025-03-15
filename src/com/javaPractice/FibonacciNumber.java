package com.javaPractice;

public class FibonacciNumber {
    public static void main(String[] args) {
        int first = 0;
        int second  = 1;
        System.out.print(first+" ");
        System.out.print(second+" ");

        for(int i = 3; i<=10; i++){
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }

    }

}
