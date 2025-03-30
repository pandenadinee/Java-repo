package com.ArrayProgram;

public class FibonacciNumber {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        fibonacciNo(first , second);

    }
    public static void fibonacciNo(int first , int second){
        System.out.println(first);
        System.out.println(second);
        for (int i = 3; i<=10 ; i++){
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }

    }
}
