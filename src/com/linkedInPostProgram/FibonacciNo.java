package com.linkedInPostProgram;

public class FibonacciNo {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        fibonacciNO(first,second);

    }
    public static void fibonacciNO(int first , int second){
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
