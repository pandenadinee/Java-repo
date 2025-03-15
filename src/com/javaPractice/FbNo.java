package com.javaPractice;

public class FbNo {
    public static void main(String[] args) {
        int frist = 0;
        int second = 1;
        febonacciNo(frist , second);

    }
    public static void febonacciNo(int first , int second){
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
