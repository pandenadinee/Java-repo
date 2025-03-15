package com.program;

public class FibonacciNo {
    public static void main(String[] args) {
        int n = 10;
        fibonacciNo(n);

    }
    public static void fibonacciNo(int n){

        int first = 0;
        int second = 1;
        System.out.print(first +" "+second+" ");

        for(int i = 3; i<=n; i++){
            int next = first + second;
            System.out.print(next+" ");

            first  = second;
            second = next;
        }
    }
}
