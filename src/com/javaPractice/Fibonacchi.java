package com.javaPractice;

public class Fibonacchi {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        fibonachhiNo(first,second);

    }
    public static void fibonachhiNo(int first , int second){
        System.out.println(first);
        System.out.println(second);
        for(int i = 3; i<=10; i++){
            int next = first + second;
            System.out.println(next);

            first = second;
            second = next;
        }

    }
}
