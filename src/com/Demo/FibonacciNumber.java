package com.Demo;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        fibonacciNum(a ,b);

    }
    public static void fibonacciNum(int a , int b){
        System.out.println("first number " + a);
        System.out.println("second number " + b );
        for (int i = 2; i<10; i++){
            int next = (a + b);
            System.out.println(next);
            a = b;
            b = next;
        }

    }
}
